package com.mustafa.controller;

import com.mustafa.entity.Kazananlar;
import com.mustafa.service.KazananlarService;
import com.mustafa.service.PuanlamaService;
import com.mustafa.service.YarismaService;
import com.mustafa.service.YarismaciService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/kazananlar")
public class KazananlarController {

    @Autowired
    private  KazananlarService kazananlarService;

    @Autowired
    private YarismaService yarismaService;

    @Autowired
    private YarismaciService yarismaciService;

    @Autowired
    private PuanlamaService puanlamaService;


    @PostMapping("/save1")
    public void save1(Long yarismaId, Long yarismaciId, String odul){
        Kazananlar kazananlar = Kazananlar.builder()
                .yarismaId(yarismaId)
                .yarismaciId(yarismaciId)
                .odul(odul)
                .build();
        kazananlarService.save(kazananlar);

    }

    @PostMapping("/save")
    public void save(){
        Kazananlar kazananlar = Kazananlar.builder()
                .yarismaId(2L)
                .yarismaciId(puanlamaService.findTopByOrderByPuanDesc().getId())
                .odul("ceyrek altın")
                .siralama(1)
                .build();
        kazananlarService.save(kazananlar);

    }

    @GetMapping("/findAll")
    public List<Kazananlar> kazananlarListesi(){
        return kazananlarService.findAll();
    }

    /**
     * 1. soru
     *  Yarışmaların kazananları kimlerdir? yarışma adı, tarihi,kazanan kullanıcı
     *  (eksik)
     */

    @GetMapping("/yarisma-detaylari")
    public List<Object> kazananlarVeYarismaDetaylari(){
        List<Kazananlar> list=kazananlarListesi();
        List<Object> number = new ArrayList<>();
        for (int i = 0; i < kazananlarListesi().size(); i++) {
             number.add(list.get(i).getYarismaciId());
             number.add(list.get(i).getYarismaId());
             number.add(list.get(i).getOdul());
             number.add(list.get(i).getSiralama());

        }
        return number;
    }

    /**
     *  3.soru
     *  En çok yarışma kazanan kullanıcı kimdir? kaç kere kazanmştır?
     */

    @GetMapping("/en-cok-yarisma-kazanan")
    public Long[] enCokYarismaKazanan(){
        Map.Entry<Long, Long> enCokTekrarEden = kazananlarListesi().stream()
                .collect(Collectors.groupingBy(k -> k.getYarismaciId(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        Long enCokTekrarEdenID = enCokTekrarEden.getKey();
        Long tekrarSayisi = enCokTekrarEden.getValue();
        return new Long[]{enCokTekrarEdenID, tekrarSayisi};
    }
}


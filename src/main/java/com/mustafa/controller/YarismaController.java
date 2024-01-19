package com.mustafa.controller;

import com.mustafa.entity.Soru;
import com.mustafa.entity.Yarisma;
import com.mustafa.entity.Yarismaci;
import com.mustafa.service.SoruService;
import com.mustafa.service.YarismaService;
import com.mustafa.service.YarismaciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/yarisma")
public class YarismaController {

    @Autowired
    private  YarismaService yarismaService;
    @Autowired
    private  SoruService soruService;

    @Autowired
    private YarismaciService yarismaciService;

    @PostMapping("/save1")
    public void save1(String ad, Long baslangicTarihi, Long sure, List<Soru> sorular, List<Yarismaci> yarismacilar, Map<Integer,String> odulleri){
        Yarisma yarisma = Yarisma.builder()
                .ad(ad)
                .baslangicTarihi(baslangicTarihi)
                .sure(sure)
                .sorular(sorular)
                .yarismacilar(yarismacilar)
                .oduller(odulleri)
                .build();
        yarismaService.save(yarisma);
    }

    @GetMapping("/findAll")
    public List<Yarisma> findAll(){
       return yarismaService.findAll();
    }

    @PostMapping("/save")
    public void save(){
        Map<Integer, String> odullerMap = new HashMap<>();
        odullerMap.put(1,"Ceyrek Altin");

        Yarisma yarisma = Yarisma.builder()
                .ad("Genel Kultur")
                .baslangicTarihi(System.currentTimeMillis())
                .sure(10000000L)
                .sorular(soruService.findAll())
                .yarismacilar(yarismaciService.findAll())
                .oduller(odullerMap)
                .build();
        yarismaService.save(yarisma);
    }

}

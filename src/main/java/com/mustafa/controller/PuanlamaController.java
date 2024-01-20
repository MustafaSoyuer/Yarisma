package com.mustafa.controller;

import com.mustafa.entity.Puanlama;
import com.mustafa.entity.Yarismaci;
import com.mustafa.service.PuanlamaService;
import com.mustafa.service.YarismaService;
import com.mustafa.service.YarismaciService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/puanlama")
public class PuanlamaController {

    @Autowired
    private PuanlamaService puanlamaService;

    @Autowired
    private YarismaciService yarismaciService;

    @Autowired
    private YarismaService yarismaService;

    @PostMapping("/save1")
    public void save1(Long yarismaciId,Long yarismaId,Long puan){
        Puanlama puanlama = Puanlama.builder()
                .yarismaciId(yarismaciId)
                .yarismaId(yarismaId)
                .puan(puan)
                .build();
        puanlamaService.save(puanlama);
    }
    @PostMapping("/save")
    public void save(){
        Puanlama puanlama1 = Puanlama.builder()
                .yarismaciId(1L)
                .yarismaId(2L)
                .puan(100L)
                .build();
        puanlamaService.save(puanlama1);

        Puanlama puanlama2 = Puanlama.builder()
                .yarismaciId(2L)
                .yarismaId(2L)
                .puan(120L)
                .build();
        puanlamaService.save(puanlama2);

        Puanlama puanlama3 = Puanlama.builder()
                .yarismaciId(3L)
                .yarismaId(2L)
                .puan(150L)
                .build();
        puanlamaService.save(puanlama3);
    }



    @GetMapping("/findAll")
    public List<Puanlama> findAll(){
        return puanlamaService.findAll();
    }


    /**
     *  2.soru cevabı
     *  Tüm zamanların en yüksek puanını alan yarışmacı kimdir?
     */
    @GetMapping("/en-yuksek-puan-yarismaci-idsi")
    public Long enYuksekPuanAlanYarismaciIdsi(){
        return puanlamaService.findTopByOrderByPuanDesc().getYarismaciId();
    }
}

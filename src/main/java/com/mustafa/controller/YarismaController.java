package com.mustafa.controller;

import com.mustafa.entity.Soru;
import com.mustafa.entity.Yarisma;
import com.mustafa.entity.Yarismaci;
import com.mustafa.service.YarismaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/yarisma")
@RequiredArgsConstructor
public class YarismaController {

    private final YarismaService yarismaService;

    @PostMapping("/save")
    public void save(String ad, Long baslangicTarihi, Long sure, List<Soru> sorular, List<Yarismaci> yarismacilar, Map<Integer,String> odulleri){
        Yarisma yarisma = Yarisma.builder()
                .ad(ad)
                .baslangicTarihi(baslangicTarihi)
                .sure(sure)
                .sorular(sorular)
                .yarismacilar(yarismacilar)
                .odulleri(odulleri)
                .build();
        yarismaService.save(yarisma);
    }

    @GetMapping("/findAll")
    public List<Yarisma> findAll(){
       return yarismaService.findAll();
    }

}

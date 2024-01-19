package com.mustafa.controller;

import com.mustafa.entity.Soru;
import com.mustafa.service.SoruService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/soru")
public class SoruContoller {

    @Autowired
    private SoruService soruService;

    @PostMapping("/save")
    public void save(String sor, Integer sure, Map<String, String> cevaplar, String dogruCevap, Integer puan) {
        Soru soru = Soru.builder()
                .soru(sor)
                .sure(sure)
                .cevaplar(cevaplar)
                .dogruCevap(dogruCevap)
                .puan(puan)
                .build();

        soruService.save(soru);
    }
    @GetMapping("/findAll")
    public List<Soru> findAll(){
        return soruService.findAll();
    }
}

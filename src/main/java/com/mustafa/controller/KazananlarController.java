package com.mustafa.controller;

import com.mustafa.entity.Kazananlar;
import com.mustafa.service.KazananlarService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kazananlar")
@RequiredArgsConstructor
public class KazananlarController {

    private final KazananlarService kazananlarService;

    @PostMapping("/save")
    public void save(Long yarismaId, Long yarismaciId, String odul){
        Kazananlar kazananlar = Kazananlar.builder()
                .yarismaId(yarismaId)
                .yarismaciId(yarismaciId)
                .odul(odul)
                .build();
        kazananlarService.save(kazananlar);

    }

    @GetMapping("/kazananlar-listesi")
    public List<Kazananlar> kazananlarListesi(){
        return kazananlarService.findAll();
    }
}

package com.mustafa.controller;

import com.mustafa.entity.Puanlama;
import com.mustafa.service.PuanlamaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/puanlama")
@RequiredArgsConstructor
public class PuanlamaController {

    private final PuanlamaService puanlamaService;

    @PostMapping("/save")
    public void save(Long yarismaciId,Long yarismaId,Long puan){
        Puanlama puanlama = Puanlama.builder()
                .yarismaciId(yarismaciId)
                .yarismaId(yarismaId)
                .puan(puan)
                .build();
        puanlamaService.save(puanlama);
    }

    @GetMapping("/findAll")
    public List<Puanlama> findAll(){
        return puanlamaService.findAll();
    }
}

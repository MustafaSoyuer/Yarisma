package com.mustafa.controller;

import com.mustafa.entity.Yarismaci;
import com.mustafa.service.YarismaciService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/yarismaci")
@RequiredArgsConstructor
public class YarismaciController {

    private final YarismaciService yarismaciService;

    @GetMapping("/save")
    public void save(String ad,String username,String avatar, String email){
        Yarismaci yarismaci = Yarismaci.builder()
                .ad(ad)
                .username(username)
                .avatar(avatar)
                .email(email)
                .build();
        yarismaciService.save(yarismaci);
    }

    @GetMapping("/findAll")
    public List<Yarismaci> findAll(){
        return yarismaciService.findAll();
    }

}

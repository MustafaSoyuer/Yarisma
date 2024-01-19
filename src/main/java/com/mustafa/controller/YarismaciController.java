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
public class YarismaciController {

    @Autowired
    private YarismaciService yarismaciService;

    @GetMapping("/save1")
    public void save1(String ad,String username,String avatar, String email){
        Yarismaci yarismaci = Yarismaci.builder()
                .ad(ad)
                .username(username)
                .avatar(avatar)
                .email(email)
                .build();
        yarismaciService.save(yarismaci);
    }

    @PostMapping("/save")
    public void save(){
        Yarismaci yarismaci1 = Yarismaci.builder()
                .ad("Ahmet")
                .username("ahmett")
                .avatar("avatar1.png")
                .email("ahmet@gmail.com")
                .build();
        yarismaciService.save(yarismaci1);

        Yarismaci yarismaci2 = Yarismaci.builder()
                .ad("Ali")
                .username("alli")
                .avatar("avatar2.png")
                .email("ali@gmail.com")
                .build();
        yarismaciService.save(yarismaci2);

        Yarismaci yarismaci3 = Yarismaci.builder()
                .ad("Veli")
                .username("velli")
                .avatar("avatar3.png")
                .email("veli@gmail.com")
                .build();
        yarismaciService.save(yarismaci3);
    }

    @GetMapping("/findAll")
    public List<Yarismaci> findAll(){
        return yarismaciService.findAll();
    }


}

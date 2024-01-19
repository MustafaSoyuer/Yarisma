package com.mustafa.controller;

import com.mustafa.entity.Soru;
import com.mustafa.service.SoruService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/soru")
public class SoruContoller {

    @Autowired
    private SoruService soruService;

    @PostMapping("/save1")
    public void save1(String sor, Integer sure, Map<String, String> cevaplar, String dogruCevap, Integer puan) {
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

    @PostMapping("/save")
    public void save() {
        Map<String, String> cevaplar1 = new HashMap<>();
		cevaplar1.put("A","Ankara");
		cevaplar1.put("B","Izmir");
		cevaplar1.put("C","Mus");
		cevaplar1.put("D","Anamur");

        Soru soru1 = Soru.builder()
                .soru("Turkiyenin baskenti neresidir?")
                .sure(60)
                .cevaplar(cevaplar1)
                .dogruCevap(cevaplar1.get("A"))
                .puan(20)
                .build();
        soruService.save(soru1);

        Map<String, String> cevaplar2 = new HashMap<>();
        cevaplar2.put("A","Ankara");
        cevaplar2.put("B","Izmir");
        cevaplar2.put("C","Mus");
        cevaplar2.put("D","Konya");

        Soru soru2= Soru.builder()
                .soru("Yuz olcumu en buyuk ilimiz?")
                .sure(60)
                .cevaplar(cevaplar2)
                .dogruCevap(cevaplar2.get("D"))
                .puan(30)
                .build();
        soruService.save(soru2);

        Map<String, String> cevaplar3 = new HashMap<>();
        cevaplar3.put("A","Ankara");
        cevaplar3.put("B","Istanbul");
        cevaplar3.put("C","Mus");
        cevaplar3.put("D","Batman");

        Soru soru3= Soru.builder()
                .soru("En kalabalık ilimiz")
                .sure(60)
                .cevaplar(cevaplar3)
                .dogruCevap(cevaplar3.get("B"))
                .puan(10)
                .build();
        soruService.save(soru3);

        Map<String, String> cevaplar4 = new HashMap<>();
        cevaplar4.put("A","Ankara");
        cevaplar4.put("B","Izmir");
        cevaplar4.put("C","Rize");
        cevaplar4.put("D","Konya");

        Soru soru4= Soru.builder()
                .soru("Hangi ilimiz Karadeniz bolgesindedir?")
                .sure(60)
                .cevaplar(cevaplar4)
                .dogruCevap(cevaplar4.get("C"))
                .puan(20)
                .build();
        soruService.save(soru4);

        Map<String, String> cevaplar5 = new HashMap<>();
        cevaplar5.put("A","Ankara");
        cevaplar5.put("B","Izmir");
        cevaplar5.put("C","Mus");
        cevaplar5.put("D","Konya");

        Soru soru5= Soru.builder()
                .soru("Hangi ilimiz Ege Bolgesindendir")
                .sure(60)
                .cevaplar(cevaplar5)
                .dogruCevap(cevaplar5.get("B"))
                .puan(30)
                .build();
        soruService.save(soru5);

        Map<String, String> cevaplar6 = new HashMap<>();
        cevaplar6.put("A","Antalya");
        cevaplar6.put("B","Izmir");
        cevaplar6.put("C","Mus");
        cevaplar6.put("D","Konya");

        Soru soru6= Soru.builder()
                .soru("Hangi ilimiz Akdeniz bolgesindedir?")
                .sure(60)
                .cevaplar(cevaplar6)
                .dogruCevap(cevaplar6.get("A"))
                .puan(40)
                .build();
        soruService.save(soru6);

        Map<String, String> cevaplar7 = new HashMap<>();
        cevaplar7.put("A","Ankara");
        cevaplar7.put("B","Izmir");
        cevaplar7.put("C","Mus");
        cevaplar7.put("D","Konya");

        Soru soru7 = Soru.builder()
                .soru("Hangi ilimiz Dogu Anadolu bolgesindedir?")
                .sure(60)
                .cevaplar(cevaplar7)
                .dogruCevap(cevaplar7.get("C"))
                .puan(20)
                .build();
        soruService.save(soru7);

        Map<String, String> cevaplar8 = new HashMap<>();
        cevaplar8.put("A","Ankara");
        cevaplar8.put("B","Izmir");
        cevaplar8.put("C","Mus");
        cevaplar8.put("D","Tekirdag");

        Soru soru8= Soru.builder()
                .soru("Hangi ilimiz Marmara bolgesindedir?")
                .sure(60)
                .cevaplar(cevaplar8)
                .dogruCevap(cevaplar8.get("D"))
                .puan(10)
                .build();
        soruService.save(soru8);

        Map<String, String> cevaplar9 = new HashMap<>();
        cevaplar9.put("A","Ankara");
        cevaplar9.put("B","Izmir");
        cevaplar9.put("C","Mus");
        cevaplar9.put("D","Antep");

        Soru soru9= Soru.builder()
                .soru("Hangi illimiz Ic Anadolu bolgesindir?")
                .sure(60)
                .cevaplar(cevaplar9)
                .dogruCevap(cevaplar9.get("A"))
                .puan(30)
                .build();
        soruService.save(soru9);

        Map<String, String> cevaplar10 = new HashMap<>();
        cevaplar10.put("A","Bulgaristan");
        cevaplar10.put("B","Yunanistan");
        cevaplar10.put("C","Almanya");
        cevaplar10.put("D","Gurcistan");

        Soru soru10= Soru.builder()
                .soru("Hangisi komsu ulke degildir?")
                .sure(60)
                .cevaplar(cevaplar10)
                .dogruCevap(cevaplar10.get("C"))
                .puan(20)
                .build();
        soruService.save(soru10);




    }
}

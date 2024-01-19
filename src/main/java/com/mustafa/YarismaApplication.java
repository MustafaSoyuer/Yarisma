package com.mustafa;

import com.mustafa.controller.SoruContoller;
import com.mustafa.controller.YarismaController;
import com.mustafa.controller.YarismaciController;
import com.mustafa.entity.Soru;
import com.mustafa.entity.Yarisma;
import com.mustafa.service.SoruService;
import com.mustafa.service.YarismaciService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class YarismaApplication {

	public static void main(String[] args) {
		Map<String, String> cevaplar = new HashMap<>();
		cevaplar.put("A","Ankara");
		cevaplar.put("B","Izmir");
		cevaplar.put("C","Mus");
		cevaplar.put("D","Anamur");

		new SoruContoller().save("Baskent?",50,cevaplar, cevaplar.get("A"),50);




		SpringApplication.run(YarismaApplication.class, args);



	}
	/**
	 *		SORU!
	 *	Repository ler oluşturulacak
	 *Controller ve Servis katmanlarında methodlar şimdilik bir birisinin kopyası olacak şekilde yazılsın
	 * 		->Contoller-> save()
	 * 		->Service  -> save()
	 *---
	 *
	 * 1 adet yarışma oluşturuyorsunuz.
	 * 10 adet soru
	 * 3 adet yarışmacı
	 * 1 adet ödül olsun kazanan bir kişi kazananlar tablosuna eklensin
	 * her bir yarışmacıya puan verilecek. 1.2.3 şeklinde sıralansınlar
	 * ----
	 *
	 * Sorgular :
	 * - yarışmaların kazananları kimlerdir? yarışma adı, tarihi,kazanan kullanıcı
	 * - Tüm zamanların en yüksek puanını alan yarışmacı kimdir?
	 * - en çok yarışma kazanan kullanıcı kimdir?
	 *
	 */

//	public static void yarismaOlustur(){
//		new YarismaController().save("Genel Kultur",15164L,545L,new ArrayList<>(),new ArrayList<>(), HashMap.newHashMap(5));
//	}


}

package com.mustafa;

import com.mustafa.controller.PuanlamaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YarismaApplication {

	public static void main(String[] args) {
		PuanlamaController puanlamaController = new PuanlamaController();



		SpringApplication.run(YarismaApplication.class, args);
		puanlamaController.enYuksekPuanAlanYarismaciIdsi();


	}
	/**
	 *		SORU!
	 *	Repository ler oluşturulacak
	 *	Controller ve Servis katmanlarında methodlar şimdilik bir birisinin kopyası olacak şekilde yazılsın
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



}

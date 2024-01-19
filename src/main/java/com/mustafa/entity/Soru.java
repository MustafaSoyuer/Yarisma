package com.mustafa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_soru")
public class Soru {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length = 800)
    String soru;
    Integer sure;
    /**
     * cevaplar.put("A","bu doğru cevap mıdır?");
     * cevaplar.put("B","bu doğru cevap mıdır?");
     * cevaplar.put("C","bu doğru cevap mıdır?");
     * cevaplar.put("D","bu doğru cevap mıdır?");
     * cevaplar.get("A")
     */
    @ElementCollection
    Map<String ,String> cevaplar;
    /**
     * A
     */
    // doğru cevap için cevaplar map inin key i kullanılacak
    String dogruCevap;
    Integer puan;
}

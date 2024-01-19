package com.mustafa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_yarisma")
public class Yarisma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    Long baslangicTarihi;
    Long sure;
    @OneToMany(cascade = CascadeType.ALL)
    List<Soru> sorular;
    @OneToMany(cascade = CascadeType.ALL)
    List<Yarismaci> yarismacilar;
    /**
     * 1->...
     * 2->...
     */
    @ElementCollection
    Map<Integer, String> oduller;
}

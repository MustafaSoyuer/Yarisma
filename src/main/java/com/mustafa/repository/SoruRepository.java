package com.mustafa.repository;

import com.mustafa.entity.Soru;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoruRepository extends JpaRepository<Soru,Long> {
}

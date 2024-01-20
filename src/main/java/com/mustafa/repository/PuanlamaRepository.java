package com.mustafa.repository;

import com.mustafa.entity.Puanlama;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PuanlamaRepository extends JpaRepository<Puanlama,Long> {
    Puanlama findTopByOrderByPuanDesc();
}

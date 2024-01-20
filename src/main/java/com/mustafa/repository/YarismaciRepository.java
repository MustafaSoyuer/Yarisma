package com.mustafa.repository;

import com.mustafa.entity.Yarismaci;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface YarismaciRepository extends JpaRepository<Yarismaci,Long> {
//Yarismaci findTopByOrderByPuanDesc();
}

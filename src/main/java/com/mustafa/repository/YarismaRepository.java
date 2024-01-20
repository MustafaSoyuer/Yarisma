package com.mustafa.repository;

import com.mustafa.entity.Yarisma;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface YarismaRepository extends JpaRepository<Yarisma,Long> {
//    List<String> findAllByOduller();
}

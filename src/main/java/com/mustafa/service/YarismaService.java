package com.mustafa.service;

import com.mustafa.entity.Yarisma;
import com.mustafa.repository.YarismaRepository;
import com.mustafa.repository.YarismaciRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class YarismaService {

    private final YarismaRepository yarismaRepository;

    public void save(Yarisma yarisma) {
        yarismaRepository.save(yarisma);
    }

    public List<Yarisma> findAll(){
        return yarismaRepository.findAll();
    }
}

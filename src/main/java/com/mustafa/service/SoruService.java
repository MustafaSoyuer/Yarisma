package com.mustafa.service;

import com.mustafa.entity.Soru;
import com.mustafa.repository.SoruRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoruService {

    @Autowired
    private SoruRepository soruRepository;
    public void save(Soru soru) {
        soruRepository.save(soru);
    }
    public List<Soru> findAll(){
        return soruRepository.findAll();
    }
}

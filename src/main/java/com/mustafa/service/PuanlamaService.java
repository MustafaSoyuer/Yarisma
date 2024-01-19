package com.mustafa.service;

import com.mustafa.entity.Puanlama;
import com.mustafa.repository.PuanlamaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PuanlamaService {

    private final PuanlamaRepository puanlamaRepository;

    public void save(Puanlama puanlama){
        puanlamaRepository.save(puanlama);
    }
    public List<Puanlama> findAll(){
        return puanlamaRepository.findAll();
    }
}
package com.mustafa.service;

import com.mustafa.entity.Kazananlar;
import com.mustafa.repository.KazananlarRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KazananlarService {

    @Autowired
    private KazananlarRespository kazananlarRespository;

    public void save(Kazananlar kazanan){
        kazananlarRespository.save(kazanan);
    }

    public List<Kazananlar> findAll(){
        return kazananlarRespository.findAll();
    }

}

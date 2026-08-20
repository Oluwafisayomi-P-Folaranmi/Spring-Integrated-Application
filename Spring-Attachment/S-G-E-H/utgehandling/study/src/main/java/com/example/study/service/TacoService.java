package com.example.study.service;

import com.example.study.model.Taco;
import com.example.study.repository.TacoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacoService {

    @Autowired
    private final TacoRepository tacoRepository;

    public TacoService(TacoRepository tacoRepository) {
        this.tacoRepository = tacoRepository;
    }

    public List<Taco> findAll() {
        return tacoRepository.findAll();
    }
}

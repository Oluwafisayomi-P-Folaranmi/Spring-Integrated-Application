package com.example.study.service;

import com.example.study.exception.resource_exception.TacoNotFoundException;
import com.example.study.exception.resource_exception.TacosNotFoundException;
import com.example.study.model.Taco.Taco;
import com.example.study.repository.TacoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TacoService {

    @Autowired
    private final TacoRepository tacoRepository;

    public TacoService(TacoRepository tacoRepository) {
        this.tacoRepository = tacoRepository;
    }

    public List<Taco> findAll() {
        return tacoRepository.findAll()
                .orElseThrow(() -> new TacosNotFoundException("There are no tacos in the backend."));
    }

    public Taco findById(Long tacoId) {
        return tacoRepository.findById(tacoId)
                .orElseThrow(() -> new TacoNotFoundException("A taco with the id '" + tacoId + "' does not exist."));
    }
}

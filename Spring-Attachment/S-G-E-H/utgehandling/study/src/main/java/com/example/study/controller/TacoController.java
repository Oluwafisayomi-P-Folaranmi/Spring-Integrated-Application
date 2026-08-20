package com.example.study.controller;

import com.example.study.model.Taco;
import com.example.study.service.TacoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api", produces="application/json")
@CrossOrigin(origins="http://tacocloud:8080")
public class TacoController {

    @Autowired
    TacoService tacoService;

    public TacoController(TacoService tacoService) {
        this.tacoService = tacoService;
    }

    @GetMapping(path = "/tacos")
    public List<Taco> tacos() {
        return tacoService.findAll();
    }
}

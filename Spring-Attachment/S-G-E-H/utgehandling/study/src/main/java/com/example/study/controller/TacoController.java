package com.example.study.controller;

import com.example.study.model.Taco.Taco;
import com.example.study.service.TacoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/tacos/{tacoId}")
    public ResponseEntity<Taco> taco(@PathVariable Long tacoId) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(tacoService.findById(tacoId));
    }
}

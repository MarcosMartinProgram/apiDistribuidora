package com.martin.apidistribuidorapedidos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistribuidoraController {
    @GetMapping("/api/v1/despedida")
    public String goodByeWorld(){
        return "Adios Mundo Cruel";
    }
}

package com.cinematch.backend.prueba;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class prueba {
    @GetMapping("/api/prueba")
    public String Hola() {
        return "hola";
    }
}

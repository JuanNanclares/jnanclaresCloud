package com.dev.cloud.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Ejemplo", description = "API de ejemplo")
public class CloudController {

    @GetMapping("/saludar")
    @Operation(summary = "Saludar", description = "Devuelve un saludo de ejemplo")
    public String getHelloWorld() {
        return "Hola visitante, bienvenido a mi sitio web";
    }

    @PostMapping("/registro")
    @Operation(summary = "Registro", description = "Devuelve un mensaje de registro de ejemplo")
    public String register(@RequestBody String name) {
        return "Bienvenido " + name + ", tu registro ha sido exitoso";
    }
}



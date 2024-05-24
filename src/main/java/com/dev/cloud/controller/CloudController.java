package com.dev.cloud.controller;

import com.dev.cloud.config.PokeClient;
import com.dev.cloud.model.PokeResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Ejemplo", description = "API de ejemplo pruebas Dev")
public class CloudController {

    @Autowired
    private PokeClient pokemonClient;

    @CrossOrigin
    @GetMapping("/saludar")
    @Operation(summary = "Saludar", description = "Devuelve un saludo de ejemplo")
    public String getHelloWorld() {
        return "Hola visitante, bienvenido a mi sitio web";
    }

    @CrossOrigin
    @PostMapping("/registro")
    @Operation(summary = "Registro", description = "Devuelve un mensaje de registro de ejemplo")
    public String register(@RequestBody String name) {
        return "Bienvenido " + name + ", tu registro ha sido exitoso";
    }

    @CrossOrigin
    @GetMapping("/pokemons")
    @Operation(summary = "Pokemon", description = "Retorna un listado de pokemons")
    public PokeResponse getPokemons(@RequestParam(value = "offset", defaultValue = "0") int offset,
                                    @RequestParam(value = "limit", defaultValue = "100") int limit) {
        return pokemonClient.getPokemons(offset, limit);
    }

    @CrossOrigin
    @GetMapping("/prueba")
    @Operation(summary = "Prueba", description = "Endpoint de prueba")
    public String test(){
        return "Prueba ejecutada éxitosamente";
    }
}



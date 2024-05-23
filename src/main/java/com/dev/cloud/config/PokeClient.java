package com.dev.cloud.config;

import com.dev.cloud.model.PokeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pokeClient", url = "https://pokeapi.co/api/v2/")
public interface PokeClient {

    @GetMapping("/pokemon")
    PokeResponse getPokemons(@RequestParam("offset") int offset, @RequestParam("limit") int limit);
}

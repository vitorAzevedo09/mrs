package com.algaworks.algalogapi.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClienteController
 */
@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public String listar() {
        return "Teste";
    }

}

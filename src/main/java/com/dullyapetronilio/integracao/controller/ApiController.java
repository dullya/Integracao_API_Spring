package com.dullyapetronilio.integracao.controller;

import dto.MensagemResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class ApiController {

    @GetMapping("/mensagem")
    public ResponseEntity<MensagemResponse> getMensagem(){

        MensagemResponse response =
                new MensagemResponse("Dados do Back-End Spring Boot", "Dullya");

        return ResponseEntity.ok(response); // padrão REST
    }

    @PostMapping("/dados")
    public ResponseEntity<MensagemResponse> receberDados(@RequestBody String dados){

        if (dados == null || dados.isBlank()){
            return ResponseEntity.badRequest().build();
        }

        MensagemResponse response =
                new MensagemResponse("Recebido: " + dados, "API");

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}

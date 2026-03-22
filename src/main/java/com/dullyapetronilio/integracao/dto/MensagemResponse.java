package com.dullyapetronilio.integracao.dto;

public class MensagemResponse {

    // É um objeto usado exclusivamente para transportar dados entre camadas ou sistemas
    // DTO -> Transporte de dados

    private String mensagem;
    private String autor;

    public MensagemResponse(String mensagem, String autor){
        this.mensagem = mensagem;
        this.autor = autor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getAutor() {
        return autor;
    }
}

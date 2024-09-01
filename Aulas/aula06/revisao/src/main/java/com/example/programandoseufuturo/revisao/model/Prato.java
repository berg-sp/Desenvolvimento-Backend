package com.example.programandoseufuturo.revisao.model;

import java.math.BigDecimal;

public class Prato {
    private int id;
    private String nome;
    private BigDecimal preço;

    public Prato() {}

    public Prato(int id, String nome, BigDecimal preço) {
        this.id = id;
        this.nome = nome;
        this.preço = preço;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreço() {
        return preço;
    }

    public void setPreço(BigDecimal preço) {
        this.preço = preço;
    }

}

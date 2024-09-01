package com.example.programandoseufuturo.revisao.model;

import java.util.List;

public class Pedido {
    private int id;
    private String descricao;
    private List<Prato> pratos;

    public Pedido() {}

    public Pedido(int id, String descricao, List<Prato> pratos) {
        this.id = id;
        this.descricao = descricao;
        this.pratos = pratos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    

}

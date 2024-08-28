package com.example.revisao.model;

import com.example.revisao.enums.TamanhosCaminhao;

public class Caminhao {
    private int id;
    private String modelo;
    private TamanhosCaminhao tamanhoCaminhao;

    public Caminhao(){}

    public Caminhao(int id, String modelo, TamanhosCaminhao tamanhoCaminhao) {
        this.id = id;
        this.modelo = modelo;
        this.tamanhoCaminhao = tamanhoCaminhao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TamanhosCaminhao getTamanhoCaminhao() {
        return tamanhoCaminhao;
    }

    public void setTamanhoCaminhao(TamanhosCaminhao tamanhoCaminhao) {
        this.tamanhoCaminhao = tamanhoCaminhao;
    }

    


}

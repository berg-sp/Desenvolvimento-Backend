package com.example.uti.model;

public class Medico {
    private int crm;
    private String nome;
    private String especilidade;
    public Medico() {

    }
    public Medico(int crm, String nome, String especilidade) {
        this.crm = crm;
        this.nome = nome;
        this.especilidade = especilidade;
    }
    public int getCrm() {
        return crm;
    }
    public void setCrm(int crm) {
        this.crm = crm;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecilidade() {
        return especilidade;
    }
    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }
    

}

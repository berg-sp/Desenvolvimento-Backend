package org.programandoseufuturo.lojavirtual.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    @JsonProperty("esta_disponivel")
    private boolean estaDisponivel;

    @JsonProperty("url_imagem")
    private String urlImagem;

    @JsonProperty("esta_favoritado")
    private boolean estaFavoritado;

    @JsonProperty("quantidade_disponivel")
    private Long quantidadeDiponivel;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public boolean isEstaDisponivel() {
        return estaDisponivel;
    }

    public void setEstaDisponivel(boolean estaDisponivel) {
        this.estaDisponivel = estaDisponivel;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public boolean isEstaFavoritado() {
        return estaFavoritado;
    }

    public void setEstaFavoritado(boolean estaFavoritado) {
        this.estaFavoritado = estaFavoritado;
    }

    public Long getQuantidadeDiponivel() {
        return quantidadeDiponivel;
    }

    public void setQuantidadeDiponivel(Long quantidadeDiponivel) {
        this.quantidadeDiponivel = quantidadeDiponivel;
    }

}

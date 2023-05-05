package com.palmsoft.catalogo_carros.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity

public class Car {
    private String nome;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Double preco;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataEdicao;

    public Car() {
    }

    public Car(String nome, Long id, Double preco, LocalDateTime dataCriacao, LocalDateTime dataEdicao) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.dataCriacao = dataCriacao;
        this.dataEdicao = dataEdicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(LocalDateTime dataEdicao) {
        this.dataEdicao = dataEdicao;
    }


    public Long getId() {


        return id;
    }
}

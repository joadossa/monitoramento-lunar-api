package com.fiap.mecatronica.monitoramento.model;

import jakarta.persistence.*;

@Entity
public class Reservatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipoRecurso;
    private Double capacidadeMaxima;
    private Double quantidadeAtual;
    private String unidadeMedida;
    private String status;

    public Reservatorio() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public Double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public Double getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public void setCapacidadeMaxima(Double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void setQuantidadeAtual(Double quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
package com.fiap.mecatronica.monitoramento.model;

import jakarta.persistence.*;

@Entity
public class AlertaOperacional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String nivelCriticidade;
    private String setor;
    private String status;

    public AlertaOperacional() {
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNivelCriticidade() {
        return nivelCriticidade;
    }

    public String getSetor() {
        return setor;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNivelCriticidade(String nivelCriticidade) {
        this.nivelCriticidade = nivelCriticidade;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
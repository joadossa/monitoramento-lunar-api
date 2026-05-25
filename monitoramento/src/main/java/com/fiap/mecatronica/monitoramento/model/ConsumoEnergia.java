package com.fiap.mecatronica.monitoramento.model;

import jakarta.persistence.*;

@Entity
public class ConsumoEnergia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String setor;
    private Double consumoAtual;
    private Double limiteConsumo;
    private String unidadeMedida;
    private String status;

    public ConsumoEnergia() {
    }

    public Long getId() {
        return id;
    }

    public String getSetor() {
        return setor;
    }

    public Double getConsumoAtual() {
        return consumoAtual;
    }

    public Double getLimiteConsumo() {
        return limiteConsumo;
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

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setConsumoAtual(Double consumoAtual) {
        this.consumoAtual = consumoAtual;
    }

    public void setLimiteConsumo(Double limiteConsumo) {
        this.limiteConsumo = limiteConsumo;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
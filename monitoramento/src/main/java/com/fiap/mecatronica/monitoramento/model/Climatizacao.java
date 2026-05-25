package com.fiap.mecatronica.monitoramento.model;

public class Climatizacao {
}
package com.fiap.mecatronica.monitoramento.model;

import jakarta.persistence.*;

@Entity
public class Climatizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String setor;
    private Double temperaturaAtual;
    private Double umidadeAtual;
    private Double nivelOxigenio;
    private String status;

    public Climatizacao() {
    }

    public Long getId() {
        return id;
    }

    public String getSetor() {
        return setor;
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public Double getUmidadeAtual() {
        return umidadeAtual;
    }

    public Double getNivelOxigenio() {
        return nivelOxigenio;
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

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public void setUmidadeAtual(Double umidadeAtual) {
        this.umidadeAtual = umidadeAtual;
    }

    public void setNivelOxigenio(Double nivelOxigenio) {
        this.nivelOxigenio = nivelOxigenio;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
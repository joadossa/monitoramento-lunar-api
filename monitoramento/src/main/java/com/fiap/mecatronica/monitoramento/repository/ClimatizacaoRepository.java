package com.fiap.mecatronica.monitoramento.repository;

import com.fiap.mecatronica.monitoramento.model.Climatizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClimatizacaoRepository extends JpaRepository<Climatizacao, Long> {
}
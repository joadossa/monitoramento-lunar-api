package com.fiap.mecatronica.monitoramento.repository;

import com.fiap.mecatronica.monitoramento.model.AlertaOperacional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertaOperacionalRepository extends JpaRepository<AlertaOperacional, Long> {
}
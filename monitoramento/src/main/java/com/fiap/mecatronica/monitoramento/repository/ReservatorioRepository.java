package com.fiap.mecatronica.monitoramento.repository;

import com.fiap.mecatronica.monitoramento.model.Reservatorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservatorioRepository extends JpaRepository<Reservatorio, Long> {
}
package com.fiap.mecatronica.monitoramento.repository;

import com.fiap.mecatronica.monitoramento.model.ConsumoEnergia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumoEnergiaRepository extends JpaRepository<ConsumoEnergia, Long> {
}
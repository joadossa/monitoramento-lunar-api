package com.fiap.mecatronica.monitoramento.service;

import com.fiap.mecatronica.monitoramento.model.ConsumoEnergia;
import com.fiap.mecatronica.monitoramento.repository.ConsumoEnergiaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumoEnergiaService {

    private final ConsumoEnergiaRepository repository;

    public ConsumoEnergiaService(ConsumoEnergiaRepository repository) {
        this.repository = repository;
    }

    public List<ConsumoEnergia> listarTodos() {
        return repository.findAll();
    }

    public ConsumoEnergia buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro de consumo de energia não encontrado"));
    }

    public ConsumoEnergia cadastrar(ConsumoEnergia consumoEnergia) {
        return repository.save(consumoEnergia);
    }

    public ConsumoEnergia atualizar(Long id, ConsumoEnergia dadosAtualizados) {
        ConsumoEnergia consumoEnergia = buscarPorId(id);

        consumoEnergia.setSetor(dadosAtualizados.getSetor());
        consumoEnergia.setConsumoAtual(dadosAtualizados.getConsumoAtual());
        consumoEnergia.setLimiteConsumo(dadosAtualizados.getLimiteConsumo());
        consumoEnergia.setUnidadeMedida(dadosAtualizados.getUnidadeMedida());
        consumoEnergia.setStatus(dadosAtualizados.getStatus());

        return repository.save(consumoEnergia);
    }

    public void deletar(Long id) {
        ConsumoEnergia consumoEnergia = buscarPorId(id);
        repository.delete(consumoEnergia);
    }
}
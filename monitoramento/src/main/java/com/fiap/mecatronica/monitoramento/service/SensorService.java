package com.fiap.mecatronica.monitoramento.service;

import com.fiap.mecatronica.monitoramento.model.Sensor;
import com.fiap.mecatronica.monitoramento.repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private final SensorRepository repository;

    public SensorService(SensorRepository repository) {
        this.repository = repository;
    }

    public List<Sensor> listarTodos() {
        return repository.findAll();
    }

    public Sensor buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sensor não encontrado"));
    }

    public Sensor cadastrar(Sensor sensor) {
        return repository.save(sensor);
    }

    public Sensor atualizar(Long id, Sensor dadosAtualizados) {
        Sensor sensor = buscarPorId(id);

        sensor.setNome(dadosAtualizados.getNome());
        sensor.setTipo(dadosAtualizados.getTipo());
        sensor.setUnidadeMedida(dadosAtualizados.getUnidadeMedida());
        sensor.setValorAtual(dadosAtualizados.getValorAtual());
        sensor.setLocalizacao(dadosAtualizados.getLocalizacao());
        sensor.setStatus(dadosAtualizados.getStatus());

        return repository.save(sensor);
    }

    public void deletar(Long id) {
        Sensor sensor = buscarPorId(id);
        repository.delete(sensor);
    }
}
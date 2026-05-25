package com.fiap.mecatronica.monitoramento.service;

import com.fiap.mecatronica.monitoramento.model.AlertaOperacional;
import com.fiap.mecatronica.monitoramento.repository.AlertaOperacionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertaOperacionalService {

    private final AlertaOperacionalRepository repository;

    public AlertaOperacionalService(AlertaOperacionalRepository repository) {
        this.repository = repository;
    }

    public List<AlertaOperacional> listarTodos() {
        return repository.findAll();
    }

    public AlertaOperacional buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alerta operacional não encontrado"));
    }

    public AlertaOperacional cadastrar(AlertaOperacional alertaOperacional) {
        return repository.save(alertaOperacional);
    }

    public AlertaOperacional atualizar(Long id, AlertaOperacional dadosAtualizados) {
        AlertaOperacional alertaOperacional = buscarPorId(id);

        alertaOperacional.setTitulo(dadosAtualizados.getTitulo());
        alertaOperacional.setDescricao(dadosAtualizados.getDescricao());
        alertaOperacional.setNivelCriticidade(dadosAtualizados.getNivelCriticidade());
        alertaOperacional.setSetor(dadosAtualizados.getSetor());
        alertaOperacional.setStatus(dadosAtualizados.getStatus());

        return repository.save(alertaOperacional);
    }

    public void deletar(Long id) {
        AlertaOperacional alertaOperacional = buscarPorId(id);
        repository.delete(alertaOperacional);
    }
}
package com.fiap.mecatronica.monitoramento.service;

import com.fiap.mecatronica.monitoramento.model.Reservatorio;
import com.fiap.mecatronica.monitoramento.repository.ReservatorioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservatorioService {

    private final ReservatorioRepository repository;

    public ReservatorioService(ReservatorioRepository repository) {
        this.repository = repository;
    }

    public List<Reservatorio> listarTodos() {
        return repository.findAll();
    }

    public Reservatorio buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservatório não encontrado"));
    }

    public Reservatorio cadastrar(Reservatorio reservatorio) {
        return repository.save(reservatorio);
    }

    public Reservatorio atualizar(Long id, Reservatorio dadosAtualizados) {
        Reservatorio reservatorio = buscarPorId(id);

        reservatorio.setNome(dadosAtualizados.getNome());
        reservatorio.setTipoRecurso(dadosAtualizados.getTipoRecurso());
        reservatorio.setCapacidadeMaxima(dadosAtualizados.getCapacidadeMaxima());
        reservatorio.setQuantidadeAtual(dadosAtualizados.getQuantidadeAtual());
        reservatorio.setUnidadeMedida(dadosAtualizados.getUnidadeMedida());
        reservatorio.setStatus(dadosAtualizados.getStatus());

        return repository.save(reservatorio);
    }

    public void deletar(Long id) {
        Reservatorio reservatorio = buscarPorId(id);
        repository.delete(reservatorio);
    }
}
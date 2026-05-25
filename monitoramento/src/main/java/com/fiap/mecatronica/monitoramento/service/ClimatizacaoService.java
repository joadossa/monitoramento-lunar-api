package com.fiap.mecatronica.monitoramento.service;

import com.fiap.mecatronica.monitoramento.model.Climatizacao;
import com.fiap.mecatronica.monitoramento.repository.ClimatizacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClimatizacaoService {

    private final ClimatizacaoRepository repository;

    public ClimatizacaoService(ClimatizacaoRepository repository) {
        this.repository = repository;
    }

    public List<Climatizacao> listarTodos() {
        return repository.findAll();
    }

    public Climatizacao buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro de climatização não encontrado"));
    }

    public Climatizacao cadastrar(Climatizacao climatizacao) {
        return repository.save(climatizacao);
    }

    public Climatizacao atualizar(Long id, Climatizacao dadosAtualizados) {
        Climatizacao climatizacao = buscarPorId(id);

        climatizacao.setSetor(dadosAtualizados.getSetor());
        climatizacao.setTemperaturaAtual(dadosAtualizados.getTemperaturaAtual());
        climatizacao.setUmidadeAtual(dadosAtualizados.getUmidadeAtual());
        climatizacao.setNivelOxigenio(dadosAtualizados.getNivelOxigenio());
        climatizacao.setStatus(dadosAtualizados.getStatus());

        return repository.save(climatizacao);
    }

    public void deletar(Long id) {
        Climatizacao climatizacao = buscarPorId(id);
        repository.delete(climatizacao);
    }
}
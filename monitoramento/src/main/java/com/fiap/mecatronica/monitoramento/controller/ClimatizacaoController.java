package com.fiap.mecatronica.monitoramento.controller;

import com.fiap.mecatronica.monitoramento.model.Climatizacao;
import com.fiap.mecatronica.monitoramento.service.ClimatizacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/climatizacoes")
@CrossOrigin(origins = "*")
public class ClimatizacaoController {

    private final ClimatizacaoService service;

    public ClimatizacaoController(ClimatizacaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Climatizacao> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Climatizacao buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Climatizacao cadastrar(@RequestBody Climatizacao climatizacao) {
        return service.cadastrar(climatizacao);
    }

    @PutMapping("/{id}")
    public Climatizacao atualizar(@PathVariable Long id, @RequestBody Climatizacao climatizacao) {
        return service.atualizar(id, climatizacao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
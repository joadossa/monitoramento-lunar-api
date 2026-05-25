package com.fiap.mecatronica.monitoramento.controller;

import com.fiap.mecatronica.monitoramento.model.Reservatorio;
import com.fiap.mecatronica.monitoramento.service.ReservatorioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservatorios")
@CrossOrigin(origins = "*")
public class ReservatorioController {

    private final ReservatorioService service;

    public ReservatorioController(ReservatorioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Reservatorio> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Reservatorio buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Reservatorio cadastrar(@RequestBody Reservatorio reservatorio) {
        return service.cadastrar(reservatorio);
    }

    @PutMapping("/{id}")
    public Reservatorio atualizar(@PathVariable Long id, @RequestBody Reservatorio reservatorio) {
        return service.atualizar(id, reservatorio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
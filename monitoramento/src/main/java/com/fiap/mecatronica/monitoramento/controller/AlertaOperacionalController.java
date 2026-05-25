package com.fiap.mecatronica.monitoramento.controller;

import com.fiap.mecatronica.monitoramento.model.AlertaOperacional;
import com.fiap.mecatronica.monitoramento.service.AlertaOperacionalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alertas")
@CrossOrigin(origins = "*")
public class AlertaOperacionalController {

    private final AlertaOperacionalService service;

    public AlertaOperacionalController(AlertaOperacionalService service) {
        this.service = service;
    }

    @GetMapping
    public List<AlertaOperacional> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public AlertaOperacional buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public AlertaOperacional cadastrar(@RequestBody AlertaOperacional alertaOperacional) {
        return service.cadastrar(alertaOperacional);
    }

    @PutMapping("/{id}")
    public AlertaOperacional atualizar(@PathVariable Long id, @RequestBody AlertaOperacional alertaOperacional) {
        return service.atualizar(id, alertaOperacional);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
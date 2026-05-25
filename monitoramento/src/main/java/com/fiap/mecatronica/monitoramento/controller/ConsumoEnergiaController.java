package com.fiap.mecatronica.monitoramento.controller;

import com.fiap.mecatronica.monitoramento.model.ConsumoEnergia;
import com.fiap.mecatronica.monitoramento.service.ConsumoEnergiaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumos-energia")
@CrossOrigin(origins = "*")
public class ConsumoEnergiaController {

    private final ConsumoEnergiaService service;

    public ConsumoEnergiaController(ConsumoEnergiaService service) {
        this.service = service;
    }

    @GetMapping
    public List<ConsumoEnergia> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ConsumoEnergia buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public ConsumoEnergia cadastrar(@RequestBody ConsumoEnergia consumoEnergia) {
        return service.cadastrar(consumoEnergia);
    }

    @PutMapping("/{id}")
    public ConsumoEnergia atualizar(@PathVariable Long id, @RequestBody ConsumoEnergia consumoEnergia) {
        return service.atualizar(id, consumoEnergia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
package com.fiap.mecatronica.monitoramento.controller;

import com.fiap.mecatronica.monitoramento.model.Sensor;
import com.fiap.mecatronica.monitoramento.service.SensorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores")
@CrossOrigin(origins = "*")
public class SensorController {

    private final SensorService service;

    public SensorController(SensorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Sensor> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Sensor buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Sensor cadastrar(@RequestBody Sensor sensor) {
        return service.cadastrar(sensor);
    }

    @PutMapping("/{id}")
    public Sensor atualizar(@PathVariable Long id, @RequestBody Sensor sensor) {
        return service.atualizar(id, sensor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
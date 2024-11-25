package com.coderhouse.controller;

import com.coderhouse.dto.ComprobanteDTO;
import com.coderhouse.model.Comprobante;
import com.coderhouse.service.ComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comprobantes")
public class ComprobanteController {

    @Autowired
    private ComprobanteService comprobanteService;

    @PostMapping
    public ResponseEntity<Comprobante> crearComprobante(@RequestBody ComprobanteDTO comprobanteDTO) {
        try {
            Comprobante comprobante = comprobanteService.guardarComprobante(comprobanteDTO);
            return new ResponseEntity<>(comprobante, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<List<Comprobante>> listarComprobantes() {
        List<Comprobante> comprobantes = comprobanteService.listarComprobantes();
        return new ResponseEntity<>(comprobantes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comprobante> obtenerComprobantePorId(@PathVariable Long id) {
        try {
            Comprobante comprobante = comprobanteService.buscarComprobantePorId(id);
            return new ResponseEntity<>(comprobante, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

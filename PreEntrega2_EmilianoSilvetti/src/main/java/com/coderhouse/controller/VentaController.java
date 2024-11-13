package com.coderhouse.controller;

import com.coderhouse.model.Venta;
import com.coderhouse.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    
    private VentaService ventaService;

    @PostMapping
    public ResponseEntity<Venta> crearVenta(@RequestBody Venta venta) {
        Venta nuevaVenta = ventaService.guardarVenta(venta);
        return new ResponseEntity<>(nuevaVenta, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venta> obtenerVentaPorId(@PathVariable Long id) {
        Optional<Venta> venta = ventaService.buscarVentaPorId(id);
        return venta.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Venta>> listarVentas() {
        List<Venta> ventas = ventaService.listarVentas();
        return new ResponseEntity<>(ventas,  HttpStatus.OK);
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarVenta(@PathVariable Long id) {
    	
        ventaService.eliminarVenta(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    
}

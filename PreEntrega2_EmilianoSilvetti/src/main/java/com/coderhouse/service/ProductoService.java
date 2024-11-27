package com.coderhouse.service;

import com.coderhouse.model.Producto;
import com.coderhouse.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto guardarProducto(Producto producto) {
    	
        return productoRepository.save(producto);
    }

    public Optional<Producto> buscarProductoPorId(Long id) {
        return productoRepository.findById(id);
    }

    public List<Producto> listarProductos() {
    	
    	
        return productoRepository.findAll();
    }

    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}

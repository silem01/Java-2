package com.coderhouse.repository;

import com.coderhouse.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
    // Métodos adicionales personalizados se pueden definir aquí
}

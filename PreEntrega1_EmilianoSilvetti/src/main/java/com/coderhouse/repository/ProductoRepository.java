package com.coderhouse.repository;

import com.coderhouse.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Aquí también puedes agregar métodos personalizados si necesitas consultas adicionales
}

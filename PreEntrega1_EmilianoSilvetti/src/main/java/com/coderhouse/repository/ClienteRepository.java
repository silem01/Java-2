package com.coderhouse.repository;

import com.coderhouse.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Métodos personalizados, si se necesitan, se pueden agregar aquí
}

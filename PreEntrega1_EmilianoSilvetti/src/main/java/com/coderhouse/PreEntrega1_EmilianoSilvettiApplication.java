package com.coderhouse;

import com.coderhouse.model.Cliente;
import com.coderhouse.model.Producto;
import com.coderhouse.model.Venta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@SpringBootApplication
public class PreEntrega1_EmilianoSilvettiApplication implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;
    
    

    public static void main(String[] args) {
        SpringApplication.run(PreEntrega1_EmilianoSilvettiApplication.class, args);
    }

    @Override
    @Transactional 
    public void run(String... args) throws Exception {
        // Crear y persistir productos
    	
        Producto producto1 = new Producto("Producto A", 100.0, "Descripción A", 50);
        Producto producto2 = new Producto("Producto B", 150.0, "Descripción B", 30);

        entityManager.persist(producto1);
        entityManager.persist(producto2);

        
        // Crear  persistir cliente
        Cliente cliente = new Cliente("Emiliano Silvetti", "Brandsen 805", "Emi@BocaJuniors.com", "123456789");
        entityManager.persist(cliente);

        // Crear  persistir venta
        Venta venta = new Venta(2, new Date(), cliente, producto1, 200.0);
        entityManager.persist(venta);
        
    }
    
    
    
}

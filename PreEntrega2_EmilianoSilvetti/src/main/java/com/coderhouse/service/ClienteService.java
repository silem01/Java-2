package com.coderhouse.service;

import com.coderhouse.model.Cliente;
import com.coderhouse.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente guardarCliente(Cliente cliente) {
    	
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
        
        
    }
}

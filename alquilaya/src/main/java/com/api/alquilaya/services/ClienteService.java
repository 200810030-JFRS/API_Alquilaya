package com.api.alquilaya.services;

import com.api.alquilaya.models.ClienteModel;
import com.api.alquilaya.repositories.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    // Obtener todos los clientes
    public List<ClienteModel> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Buscar cliente por email (Soluciona el error rojo en el controlador)
    public Optional<ClienteModel> getClienteByEmail(String email) {
        return clienteRepository.findByEmail(email);
    }

    // Buscar cliente por licencia (Soluciona el error rojo en el controlador)
    public Optional<ClienteModel> getClienteByLicencia(String licencia) {
        return clienteRepository.findByLicencia(licencia);
    }
}
package com.api.alquilaya.repositories;

import com.api.alquilaya.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClienteRepository extends JpaRepository<ClienteModel, Long> {
    
    // Métodos de consulta automática por JPA
    Optional<ClienteModel> findByEmail(String email);
    Optional<ClienteModel> findByLicencia(String licencia);
}
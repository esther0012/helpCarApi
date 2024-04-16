package com.example.helpcarapi.repository;

import com.example.helpcarapi.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {

    // Aqui você pode adicionar métodos de consulta específicos, se necessário
}

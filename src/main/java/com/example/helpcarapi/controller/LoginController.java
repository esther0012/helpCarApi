package com.example.helpcarapi.controller;

import com.example.helpcarapi.domain.dto.LoginDTO;
import com.example.helpcarapi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO) {
        boolean isAuthenticated = loginService.authenticate(loginDTO.getEmail(), loginDTO.getSenha());
        if (isAuthenticated) {
            return "Login bem-sucedido!";
        } else {
            return "Credenciais inválidas. Falha ao fazer login.";
        }
    }
}

package com.example.helpcarapi.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {

    private static final Map<String, String> users = new HashMap<>();

    static {
        // Adicionando alguns usuários ao banco de dados fictício (email e senha)
        users.put("user1@example.com", "password1");
        users.put("user2@example.com", "password2");
        // Adicione mais usuários conforme necessário
    }

    public boolean authenticate(String email, String senha) {
        // Verificar se o email existe no banco de dados
        if (!users.containsKey(email)) {
            return false; // Email não encontrado
        }

        // Verificar se a senha corresponde ao email fornecido
        String senhaArmazenada = users.get(email);
        return senha.equals(senhaArmazenada);
    }
}

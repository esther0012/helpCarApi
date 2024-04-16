package com.example.helpcarapi.service;

import com.example.helpcarapi.model.Cadastro;
import com.example.helpcarapi.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository cadastroRepository;

    public void criarCadastro(Cadastro cadastro) {
        cadastroRepository.save(cadastro);
    }

    public Cadastro obterCadastroPorId(Long id) {
        return cadastroRepository.findById(id).orElse(null);
    }

    public boolean atualizarCadastro(Long id, Cadastro novoCadastro) {
        Cadastro cadastroExistente = cadastroRepository.findById(id).orElse(null);
        if (cadastroExistente != null) {
            novoCadastro.setId(id); // Garantir que o novo cadastro tenha o mesmo ID do cadastro existente
            cadastroRepository.save(novoCadastro);
            return true;
        } else {
            return false;
        }
    }

    public boolean deletarCadastro(Long id) {
        Cadastro cadastroExistente = cadastroRepository.findById(id).orElse(null);
        if (cadastroExistente != null) {
            cadastroRepository.delete(cadastroExistente);
            return true;
        } else {
            return false;
        }
    }
}

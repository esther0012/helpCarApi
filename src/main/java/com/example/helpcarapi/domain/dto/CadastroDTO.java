package com.example.helpcarapi.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CadastroDTO {

    private String nome;
    private String genero;
    private String sobrenome;
    private String cpf;
    private String dtNascimento;
    private boolean pcd;

    public CadastroDTO(String nome, String genero, String sobrenome, String cpf, String dtNascimento, boolean pcd) {
        this.nome = nome;
        this.genero = genero;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.pcd = pcd;
    }
}

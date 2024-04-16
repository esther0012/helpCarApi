package com.example.helpcarapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CADASTRO")
@Getter
@Setter
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String genero;
    private String sobrenome;
    private String cpf;
    private String dtNascimento;
    private boolean pcd;
}

package com.example.helpcarapi.domain.dto;

public class CadastroDTO {

    private String nome;
    private String genero;
    private String sobrenome;
    private String cpf;
    private String dtNascimento;
    private boolean pcd;

    // Construtores
    public CadastroDTO() {
    }

    public CadastroDTO(String nome, String genero, String sobrenome, String cpf, String dtNascimento, boolean pcd) {
        this.nome = nome;
        this.genero = genero;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.pcd = pcd;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public boolean isPcd() {
        return pcd;
    }

    public void setPcd(boolean pcd) {
        this.pcd = pcd;
    }
}

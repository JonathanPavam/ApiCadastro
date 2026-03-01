package com.apiCadastro.ApiCadastro;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class PessoaModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    int idade;

    public PessoaModel(){}
    public PessoaModel(String nome, String email, int idade)
    {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }



}

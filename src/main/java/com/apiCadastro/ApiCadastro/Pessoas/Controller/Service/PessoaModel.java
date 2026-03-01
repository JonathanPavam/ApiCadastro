package com.apiCadastro.ApiCadastro.Pessoas.Controller.Service;

import com.apiCadastro.ApiCadastro.Tarefas.TarefasModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class PessoaModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "tarefa_id")
    private TarefasModel tarefa;


    public PessoaModel(){}
    public PessoaModel(String nome, String email, int idade)
    {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }





    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
}

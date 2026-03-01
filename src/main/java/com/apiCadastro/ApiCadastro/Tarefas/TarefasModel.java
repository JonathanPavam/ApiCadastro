package com.apiCadastro.ApiCadastro.Tarefas;

import com.apiCadastro.ApiCadastro.Pessoas.Controller.Service.PessoaModel;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "tb_tarefas")
public class TarefasModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    @OneToMany(mappedBy = "tarefa")
    private List<PessoaModel> pessoa;

}

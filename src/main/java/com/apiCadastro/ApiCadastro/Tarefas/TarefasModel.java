package com.apiCadastro.ApiCadastro.Tarefas;

import com.apiCadastro.ApiCadastro.Pessoas.PessoaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Entity
@Table(name = "tb_tarefas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TarefasModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    @OneToMany(mappedBy = "tarefa")
    @JsonIgnore
    private List<PessoaModel> pessoa;
}

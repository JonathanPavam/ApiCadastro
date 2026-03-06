package com.apiCadastro.ApiCadastro.Pessoas;

import com.apiCadastro.ApiCadastro.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDto
{
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String imagemUrl;
    private String relevancia;

    private TarefasModel tarefa;

}

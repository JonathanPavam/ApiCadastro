package com.apiCadastro.ApiCadastro.Pessoas;

import com.apiCadastro.ApiCadastro.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "url_imagem")
    private String imagemUrl;

    @ManyToOne
    @JoinColumn(name = "tarefa_id")
    private TarefasModel tarefa;


}

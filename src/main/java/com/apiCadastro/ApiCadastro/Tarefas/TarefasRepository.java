package com.apiCadastro.ApiCadastro.Tarefas;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefasRepository extends JpaRepository<TarefasModel, Long>
{

    List<TarefasModel> id(Long id);
}

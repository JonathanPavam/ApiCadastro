package com.apiCadastro.ApiCadastro.Pessoas;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long>
{

    List<PessoaModel> id(Long id);
}

package com.apiCadastro.ApiCadastro.Pessoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class PessoaService
{
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    //Listar pessoas
    public List <PessoaModel> listarTodasPessoas()
    {
        return pessoaRepository.findAll();
    }

    public PessoaModel listarPessoasId(Long id)
    {
        Optional<PessoaModel> pessoaId = pessoaRepository.findById(id);
        return pessoaId.orElse(null);
    }



}

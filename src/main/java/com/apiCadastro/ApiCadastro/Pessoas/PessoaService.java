package com.apiCadastro.ApiCadastro.Pessoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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



}

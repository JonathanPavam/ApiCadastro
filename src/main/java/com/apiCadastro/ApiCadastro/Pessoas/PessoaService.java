package com.apiCadastro.ApiCadastro.Pessoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class PessoaService
{
    private PessoaMapper pessoaMapper;
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    //Listar pessoas
    public List <PessoaDto> listarTodasPessoas()
    {
        return pessoaRepository.findAll();
    }

    //Por id
    public PessoaModel listarPessoasId(Long id)
    {
        Optional<PessoaModel> pessoaId = pessoaRepository.findById(id);
        return pessoaId.orElse(null);
    }

    //
    //Add Pessoa
    public PessoaDto criarPessoa(PessoaDto pessoaDto)
    {
         PessoaModel pessoa = new pessoaMapper.map(pessoaDto);
         pessoa =pessoaRepository.save(pessoa);
         return pessoaMapper.map(pessoa);
    }

    //
    //Deletar ninja
    @DeleteMapping
    public void deletarpPessoa(Long id)
    {
        pessoaRepository.deleteById(id);
    }

    //
     // Alterar dados
    @PutMapping
    public String alterarPessoa(PessoaModel pessoa, Long id)
    {
        PessoaModel pessoaModel = pessoaRepository.save(pessoa);
        return "Atualizado";
    }


}

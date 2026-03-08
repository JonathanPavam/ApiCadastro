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
import java.util.stream.Collectors;

@Service
public class PessoaService
{
    private PessoaMapper pessoaMapper;
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository, PessoaMapper pessoaMapper) {
        this.pessoaRepository = pessoaRepository;
        this.pessoaMapper = pessoaMapper;
    }

    //Listar pessoas
    public List <PessoaDto> listarTodasPessoas()
    {
        List<PessoaModel> pessoas = pessoaRepository.findAll();
        return pessoas.stream()
        .map(pessoaMapper::map)
                .collect(Collectors.toList());
    }

    //Por id
    public PessoaDto listarPessoasId(Long id)
    {
        Optional<PessoaModel> pessoa = pessoaRepository.findById(id);
        return pessoa.map(pessoaMapper::map).orElse(null);
    }

    //
    //Add Pessoa
    public PessoaDto criarPessoa(PessoaDto pessoaDto)
    {
         PessoaModel pessoa = pessoaMapper.map(pessoaDto);
         pessoa = pessoaRepository.save(pessoa);
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

    public PessoaDto alterarPessoa(PessoaDto pessoa, Long id)
    {
        Optional<PessoaModel> pessoaId = pessoaRepository.findById(id);
        if(pessoaId.isPresent())
        {
            PessoaModel pessoaAtt = pessoaMapper.map(pessoa);
            pessoaAtt.setId(id);
            PessoaModel pessoaSalva = pessoaRepository.save(pessoaAtt);
            return pessoaMapper.map(pessoaSalva);
        }
        return null;
    }


}

package com.apiCadastro.ApiCadastro.Pessoas;

import org.springframework.stereotype.Component;

@Component
public class PessoaMapper
{
    public PessoaModel map(PessoaDto pessoaDto)
    {
        PessoaModel pessoaModel = new PessoaModel();
        pessoaModel.setId(pessoaDto.getId());
        pessoaModel.setNome(pessoaDto.getNome());
        pessoaModel.setEmail(pessoaDto.getEmail());
        pessoaModel.setIdade(pessoaDto.getIdade());
        pessoaModel.setImagemUrl(pessoaDto.getImagemUrl());
        pessoaModel.setRelevancia(pessoaDto.getRelevancia());
        pessoaModel.setTarefa(pessoaDto.getTarefa());

        return pessoaModel;
    }
    public PessoaDto map (PessoaModel pessoaModel)
    {
        PessoaDto pessoaDto = new PessoaDto();
        pessoaDto.setId(pessoaModel.getId());
        pessoaDto.setNome(pessoaModel.getNome());
        pessoaDto.setEmail(pessoaModel.getEmail());
        pessoaDto.setIdade(pessoaModel.getIdade());
        pessoaDto.setImagemUrl(pessoaModel.getImagemUrl());
        pessoaDto.setRelevancia(pessoaModel.getRelevancia());
        pessoaDto.setTarefa(pessoaModel.getTarefa());

        return pessoaDto;
    }


}

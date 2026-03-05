package com.apiCadastro.ApiCadastro.Pessoas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController
{
    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {this.pessoaService = pessoaService;}

    @GetMapping("/oi")
    public String boasVindas()
    {
        return "Oi";
    }

    //Adicionar Pessoa
    @PostMapping("/createPessoas")
    public String createPessoa()
    {
        return "Criado com sucesso";
    }

    //Procurar pessoa - por id
    @GetMapping("/listar")
    public List<PessoaModel> getAllPessoas()
    {
        return pessoaService.listarTodasPessoas();
    }

    //Listar pessoas
    @GetMapping("getPessoasId")
    public String getPessoaId()
    {
        return "Busca por ID";
    }

    //Alterar dados
    @PutMapping
    public String alterarPessoa()
    {
        return "Alterado";
    }

    //Deletar
    @DeleteMapping("/deletarId")
    public String deletarPessoa()
    {
        return "Pessoa deletada";
    }
}

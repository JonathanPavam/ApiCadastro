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
    @PostMapping("/criar")
    public PessoaModel criarPessoa(@RequestBody PessoaModel pessoa)
    {
        return pessoaService.criarPessoa(pessoa);
    }

    //Listar
    @GetMapping("/listar")
    public List<PessoaModel> getAllPessoas()
    {
        return pessoaService.listarTodasPessoas();
    }

    //Listar pessoas
    @GetMapping("/listar/{id}")
    public PessoaModel getPessoaId(@PathVariable Long id)
    {
        return pessoaService.listarPessoasId(id);
    }

    //Alterar dados
    @PutMapping("/att/{id}")
    public String alterarPessoa(@PathVariable Long id, @RequestBody PessoaModel pessoa)
    {
        pessoaService.alterarPessoa(pessoa, id);
        return "Alteracao feita";
    }

    //Deletar
    @DeleteMapping("/deletarId/{id}")
    public void deletarPessoa(@PathVariable Long id)
    {
        pessoaService.deletarpPessoa(id);
    }




}

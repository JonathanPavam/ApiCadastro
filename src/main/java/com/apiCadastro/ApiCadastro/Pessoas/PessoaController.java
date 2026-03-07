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
    public PessoaDto criarPessoa(@RequestBody PessoaDto pessoa)
    {
        return pessoaService.criarPessoa(pessoa);
    }

    //Listar
    @GetMapping("/listar")
    public List<PessoaDto> getAllPessoas()
    {
        return pessoaService.listarTodasPessoas();
    }

    //Listar pessoas
    @GetMapping("/listar/{id}")
    public PessoaDto getPessoaId(@PathVariable Long id)
    {
        return pessoaService.listarPessoasId(id);
    }

    //Alterar dados
    @PutMapping("/att/{id}")
    public PessoaDto alterarPessoa(@PathVariable Long id, @RequestBody PessoaDto pessoa)
    {
        return  pessoaService.alterarPessoa(pessoa, id);
    }

    //Deletar
    @DeleteMapping("/deletar/{id}")
    public void deletarPessoa(@PathVariable Long id)
    {
        pessoaService.deletarpPessoa(id);
    }
}

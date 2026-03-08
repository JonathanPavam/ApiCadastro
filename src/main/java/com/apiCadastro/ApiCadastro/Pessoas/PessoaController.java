package com.apiCadastro.ApiCadastro.Pessoas;

import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController
{
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {this.pessoaService = pessoaService;}

    @GetMapping("/oi")
    public String boasVindas()
    {
        return "Oi";
    }


    //Adicionar Pessoa

    @PostMapping("/criar")
    public ResponseEntity<String> criarPessoa(@RequestBody PessoaDto pessoa)
    {
        PessoaDto pessoaDto = pessoaService.criarPessoa(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso: " + pessoaDto.getNome() + "(ID): " + pessoaDto.getId());
    }

    //Listar
    @GetMapping("/listar")
    public ResponseEntity <List<PessoaDto>> listarTodos()
    {
        List<PessoaDto> listar = pessoaService.listarTodasPessoas();
            return ResponseEntity.ok(listar);
    }

    //Listar pessoas
    @GetMapping("/listar/{id}")
    public ResponseEntity <?> getPessoaId(@PathVariable Long id) {
        PessoaDto pessoa = pessoaService.listarPessoasId(id);
        if (pessoa != null)
        {
            return ResponseEntity.ok(pessoa.getNome());
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Pessoa nao encontrada");
        }
    }


    //Alterar dados
    @PutMapping("/alterar/{id}")
    public ResponseEntity alterarPessoa(@PathVariable Long id, @RequestBody PessoaDto pessoa)
    {
        PessoaDto pessoaDto = pessoaService.alterarPessoa(pessoa, id);
        if(pessoaDto != null)
        {
            return ResponseEntity.ok(pessoaDto);
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("ID nao encontrado.");
        }
    }

    //Deletar
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity deletarPessoa(@PathVariable Long id)
    {
        if(pessoaService.listarPessoasId(id) != null)
        {
            pessoaService.deletarpPessoa(id);
            return ResponseEntity.ok("Ninja deletado com sucesso, id: " + id);
        }else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body("ID nao encontrado");
        }
    }
}

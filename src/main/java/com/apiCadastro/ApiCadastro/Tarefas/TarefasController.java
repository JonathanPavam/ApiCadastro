package com.apiCadastro.ApiCadastro.Tarefas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tarefas")
public class TarefasController
{
    TarefasService tarefasService;
    //Criar
    @PostMapping("/criar")
    public String criarTarefa(@RequestBody TarefasModel tarefa)
    {
        return tarefasService.criarTarefa(tarefa);
    }

    //Atualizar
    public String atualizarTarefa(@PathVariable Long id, @RequestBody TarefasModel tarefasModel)
    {
        tarefasService.atualizarTarefa(id, tarefasModel);
        return "Atualizado";
    }

    //Listar
    @GetMapping("/listar")
    public List<TarefasModel> listarTarefa()
    {
        return tarefasService.listarTarefas();
    }

    @GetMapping("/listar/{id}")
    public TarefasModel listarTarefaId(@PathVariable Long id)
    {
        return tarefasService.listarPorId(id);

    }

    //Deletar
    @DeleteMapping("/deletar/{id}")
    public void deletarTarefa(@PathVariable Long id)
    {
        tarefasService.deletarTarefa(id);
    }

}

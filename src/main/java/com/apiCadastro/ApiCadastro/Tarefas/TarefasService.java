package com.apiCadastro.ApiCadastro.Tarefas;

import com.apiCadastro.ApiCadastro.Pessoas.PessoaRepository;
import com.apiCadastro.ApiCadastro.Pessoas.PessoaService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class TarefasService
{
    TarefasRepository tarefasRepository;
    public TarefasService(TarefasRepository tarefasRepository) {this.tarefasRepository = tarefasRepository;}

    //Listar
    public List<TarefasModel> listarTarefas()
    {
        return tarefasRepository.findAll();
    }

    //Listar por ID
    public TarefasModel listarPorId(Long id)
    {
        Optional<TarefasModel> tarefaId = tarefasRepository.findById(id);
        return tarefaId.orElse(null);
    }

    //Criar
    public String criarTarefa(TarefasModel tarefa)
    {
        tarefasRepository.save(tarefa);
        return "Tarefa criada";
    }


    //Atualizar
    public String atualizarTarefa(Long id, TarefasModel tarefa)
    {
        TarefasModel tarefaNew = atualizarTarefa.save(tarefa);
        return "Tarefa atualizada";
    }

    //Deletar
    public void deletarTarefa(Long id)
    {
        tarefasRepository.deleteById(id);
    }
}

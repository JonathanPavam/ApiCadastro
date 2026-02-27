package com.apiCadastro.ApiCadastro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller
{
    @GetMapping("/oi")
    public String boasVindas()
    {
        return "Oi";
    }
}

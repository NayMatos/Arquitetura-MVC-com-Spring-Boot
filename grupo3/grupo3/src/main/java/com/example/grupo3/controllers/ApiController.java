package com.example.grupo3.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.grupo3.models.Produto;

@RestController
@RequestMapping("/api/produto")
public class ApiController {

    private List<Produto> produtos = new ArrayList<>();

    public ApiController() {
        produtos.add(new Produto("Notebook", "1", 7000));
        produtos.add(new Produto("Camera", "2", 6000));
    }

    @GetMapping
    public List<Produto> getProdutos() {
        return produtos;
    }
}

package com.example.grupo3.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.grupo3.models.Produto;

@Controller
@RequestMapping("/produto")
public class ProdController {

    private List<Produto> produtos = new ArrayList<>();

    public ProdController() {
        produtos.add(new Produto("Notebook", "1", 7000));
        produtos.add(new Produto("Camera", "2", 6000));
    }

    @GetMapping
    public String getProdutos(Model model) {
        model.addAttribute("produtos", produtos);
        return "produto";
    }
}

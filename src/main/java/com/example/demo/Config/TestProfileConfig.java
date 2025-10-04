package com.example.demo.Config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.Domain.Categoria.Categoria;
import com.example.demo.Domain.Produto.Produto;
import com.example.demo.Repositories.CategoriaRepository;
import com.example.demo.Repositories.ProdutoRepository;

@Configuration
@Profile("test")
public class TestProfileConfig implements CommandLineRunner {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;


    @Override
    public void run(String... args) throws Exception {

        Categoria ct1 = new Categoria(null, "Eletrônicos");
        Categoria ct2 = new Categoria(null, "Periféricos");
        Categoria ct3 = new Categoria(null, "Utensílios");

        categoriaRepository.saveAll(Arrays.asList(ct1, ct2, ct3));

        Produto pd1 = new Produto(null, "TV", 2000.9, ct1);
        Produto pd2 = new Produto(null, "Celular", 2000.9, ct1);
        Produto pd3 = new Produto(null, "Notebook", 2000.9, ct1);
        Produto pd4 = new Produto(null, "Teclado", 2000.9, ct2);
        Produto pd5 = new Produto(null, "Caneca", 2000.9, ct3);
        Produto pd6 = new Produto(null, "Garrafa", 2000.9, ct3);

        produtoRepository.saveAll(Arrays.asList(pd1, pd2, pd3, pd4, pd5, pd6));

    };

    

}

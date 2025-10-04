package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Produto.Produto;
import com.example.demo.Mapper.ProdutoMapper;
import com.example.demo.Repositories.ProdutoRepository;
import com.example.demo.dto.ProdutoDto;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private ProdutoMapper produtoMappper;

    public ProdutoDto Create(Produto produto) {

        Produto obj = repository.save(produto);

        return produtoMappper.EntityToDto(obj);
    }

}

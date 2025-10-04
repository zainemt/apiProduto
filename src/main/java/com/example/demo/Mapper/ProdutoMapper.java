package com.example.demo.Mapper;

import org.springframework.stereotype.Component;

import com.example.demo.Domain.Produto.Produto;
import com.example.demo.dto.ProdutoDto;

@Component
public class ProdutoMapper {

    public ProdutoDto EntityToDto(Produto produto) {
        return new ProdutoDto(produto.getNome(), produto.getPreco());
    }

    public Produto DtoToEntity(ProdutoDto produtoDto) {
        return new Produto(null, produtoDto.getNome(), produtoDto.getPreco());
    }

}

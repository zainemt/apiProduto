package com.example.demo.Mapper;

import org.springframework.stereotype.Component;

import com.example.demo.Domain.Categoria.Categoria;
import com.example.demo.Domain.Produto.Produto;
import com.example.demo.Dto.ProdutoDto;

@Component
public class ProdutoMapper {

    public ProdutoDto EntityToDto(Produto produto) {
        return new ProdutoDto(produto.getNome(), produto.getPreco(), produto.getCategoria().getId());
    }

    public Produto DtoToEntity(ProdutoDto produtoDto, Categoria categoria) {
        return new Produto(null, produtoDto.getNome(), produtoDto.getPreco(), categoria);
    }

}

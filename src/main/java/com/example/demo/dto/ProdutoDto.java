package com.example.demo.dto;

public class ProdutoDto {

    private String nome;
    private Double preco;
    private Integer categoriaId;
    
    public ProdutoDto(String nome, Double preco, Integer categoriaId) {
        this.nome = nome;
        this.preco = preco;
        this.categoriaId = categoriaId;
    }

    public String getNome() {
        return nome;
    }
    public Double getPreco() {
        return preco;
    }
    public Integer getCategoriaId() {
        return categoriaId;
    }
    
}

package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Categoria.Categoria;
import com.example.demo.Domain.Produto.Produto;
import com.example.demo.dto.ProdutoDto;
import com.example.demo.Mapper.ProdutoMapper;
import com.example.demo.Repositories.CategoriaRepository;
import com.example.demo.Repositories.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoMapper produtoMapper;

    public ProdutoDto Create(ProdutoDto produtoDto) {

        Categoria categoria = categoriaRepository.getReferenceById(produtoDto.getCategoriaId());

        Produto produto = produtoMapper.DtoToEntity(produtoDto, categoria);

        Produto obj = repository.save(produto);

        return produtoMapper.EntityToDto(obj);
    }

    public List<ProdutoDto> getAllByCategoriaId(Integer categoriaId) {
        List<Produto> listaDeProdutos = repository.getAllByCategoria_Id(categoriaId);
        List<ProdutoDto> listaDeProdutosDto = new ArrayList<>();

        for (Produto produto : listaDeProdutos) {
            listaDeProdutosDto.add(produtoMapper.EntityToDto(produto));
        }

        return listaDeProdutosDto;
    }

}

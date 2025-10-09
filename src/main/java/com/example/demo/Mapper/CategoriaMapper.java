package com.example.demo.Mapper;

import org.springframework.stereotype.Component;

import com.example.demo.Domain.Categoria.Categoria;
import com.example.demo.dto.CategoriaDto;

@Component
public class CategoriaMapper {

    public CategoriaDto EntityToDto(Categoria categoria) {
        return new CategoriaDto(categoria.getNome());
    }

    public Categoria DtoToEntity(CategoriaDto categoriaDto) {
        return new Categoria(null, categoriaDto.getNome());
    }

}

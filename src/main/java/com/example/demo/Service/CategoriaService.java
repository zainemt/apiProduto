package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Categoria.Categoria;
import com.example.demo.Dto.CategoriaDto;
import com.example.demo.Mapper.CategoriaMapper;
import com.example.demo.Repositories.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    @Autowired
    private CategoriaMapper categoriaMapper;

    public CategoriaDto Create(Categoria categoria) {
        
        Categoria obj = repository.save(categoria);

        return categoriaMapper.EntityToDto(obj);
    }

    public CategoriaDto FindById(Integer id) {
        Categoria categoria = repository.getReferenceById(id);
        return categoriaMapper.EntityToDto(categoria);
    }

}

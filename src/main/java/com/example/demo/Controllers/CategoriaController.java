package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Domain.Categoria.Categoria;
import com.example.demo.Dto.CategoriaDto;
import com.example.demo.Service.CategoriaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @PostMapping("/criar")
    public ResponseEntity<CategoriaDto> Create(@RequestBody Categoria categoria) {
        CategoriaDto resposta = service.Create(categoria);
        return ResponseEntity.ok().body(resposta);
    }

    @GetMapping("/{categoriaId}")
    public ResponseEntity<CategoriaDto> findById(@PathVariable Integer categoriaId) {
        CategoriaDto resposta = service.FindById(categoriaId);
        return ResponseEntity.ok().body(resposta);
    }
    
}

package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.ProdutoDto;
import com.example.demo.Service.ProdutoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping("/criar")
    public ResponseEntity<ProdutoDto> Create(@RequestBody ProdutoDto produto) {
        ProdutoDto resposta = service.Create(produto);

        return ResponseEntity.ok().body(resposta);
    }

    @GetMapping(value = "/categoria/{categoriaId}")
    public ResponseEntity<List<ProdutoDto>> getAllByCategoriaId(@PathVariable Integer categoriaId ) {
        List<ProdutoDto> produtos = service.getAllByCategoriaId(categoriaId);
        
        return ResponseEntity.ok().body(produtos);
    }


}

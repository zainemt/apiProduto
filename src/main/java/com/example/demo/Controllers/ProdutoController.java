package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Domain.Produto.Produto;
import com.example.demo.Service.ProdutoService;
import com.example.demo.dto.ProdutoDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    //READ - GET
    //CREATE - POST
    //UPDATE - PUT
    //DELETE - DELETE

    @PostMapping("/criar")
    public ResponseEntity<ProdutoDto> Create(@RequestBody Produto produto) {
        ProdutoDto produtoDto = service.Create(produto);

        return ResponseEntity.ok().body(produtoDto);
    }

}

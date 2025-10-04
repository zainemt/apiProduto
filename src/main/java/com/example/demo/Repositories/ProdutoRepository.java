package com.example.demo.Repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Produto.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
    List<Produto> getAllByCategoria_Id(Integer categoriaId);
}

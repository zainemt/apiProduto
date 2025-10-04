package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Categoria.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}

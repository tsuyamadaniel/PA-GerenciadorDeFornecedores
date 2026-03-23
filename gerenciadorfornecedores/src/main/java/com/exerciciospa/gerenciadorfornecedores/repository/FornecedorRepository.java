package com.exerciciospa.gerenciadorfornecedores.repository;

import com.exerciciospa.gerenciadorfornecedores.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
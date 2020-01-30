package com.jpaSpring.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpaSpring.ecommerce.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}

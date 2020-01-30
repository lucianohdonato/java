package com.jpaSpring.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpaSpring.ecommerce.model.Cliente;


public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}

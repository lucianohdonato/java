package com.jpaSpring.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpaSpring.ecommerce.model.Cliente;
import com.jpaSpring.ecommerce.model.Produto;
import com.jpaSpring.ecommerce.model.Venda;
import com.jpaSpring.ecommerce.service.ClienteService;
import com.jpaSpring.ecommerce.service.ProdutoService;
import com.jpaSpring.ecommerce.service.VendaService;

@CrossOrigin("*")
@RestController
public class VendaController {

	@Autowired
	private VendaService service;
	@Autowired
	private ProdutoService produtoService;
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/venda")
	public ResponseEntity<Venda> post(@RequestBody Venda entity){
		try {
			Produto produto = this.produtoService.getById(entity.getProduto().getId());
			produto.setQuantidade(produto.getQuantidade() - 1);
			if (entity.getValor() == 0.0f)
				entity.setValor(produto.getPreco());
			Cliente cliente = this.clienteService.getById(entity.getCliente().getId());
			cliente.setCarteira(cliente.getCarteira() - entity.getValor());
			this.clienteService.createOrUpdate(cliente);
			Venda venda = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(venda);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/venda")
	public ResponseEntity<Venda> put(@RequestBody Venda entity){
		try {
			Produto produto = this.produtoService.getById(entity.getProduto().getId());
			produto.setQuantidade(produto.getQuantidade() + 1);
			Cliente cliente = this.clienteService.getById(entity.getCliente().getId());
			cliente.setCarteira(cliente.getCarteira() + produto.getPreco());
			cliente.setCarteira(cliente.getCarteira() - entity.getValor());
			Venda venda = this.service.createOrUpdate(entity);
			return ResponseEntity.ok(venda);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}

	@DeleteMapping("/venda/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		if(this.service.getById(id) == null) 
			return ResponseEntity.notFound().build();
		try {
			Venda venda = this.service.getById(id);
			Produto produto = this.produtoService.getById(venda.getProduto().getId());
			produto.setQuantidade(produto.getQuantidade() + 1);
			Cliente cliente = this.clienteService.getById(venda.getCliente().getId());
			cliente.setCarteira(cliente.getCarteira() + venda.getValor());
			this.service.delete(id);
			return ResponseEntity.ok("Removido com sucesso.");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@GetMapping("/venda")
	public ResponseEntity<List<Venda>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/venda/{id}")
	public ResponseEntity<Venda> getById(@PathVariable int id){
		Venda venda = this.service.getById(id);
		if(venda == null) 
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(venda);
	}
}

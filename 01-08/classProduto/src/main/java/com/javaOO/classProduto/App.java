package com.javaOO.classProduto;

public class App 
{
    public static void main( String[] args )
    {
    	Produto produto = new Produto(0, null, null, 0, 0, 0, false, null);
    	produto.alterar("codigo", 123);
    	System.out.println(produto.getCodigo());
    	produto.alterar("nome", "Joao");
    	System.out.println(produto.getNome());
    	produto.alterar("ativo", false);
    	System.out.println(produto.isAtivo());
    	produto.alterar("preço de venda", 2.20);
    	System.out.println(produto.getPreco_venda());
    }
    
}

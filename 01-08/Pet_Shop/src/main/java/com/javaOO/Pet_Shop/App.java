package com.javaOO.Pet_Shop;

import com.javaOO.Pet_Shop.Model.Animal;
import com.javaOO.Pet_Shop.Model.Cliente;
import com.javaOO.Pet_Shop.Model.Produto;

public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        Animal cachorro = new Animal("auau", "cachorro", "raça", 5, "macho", 123);
        Animal gato = new Animal("miau", "gato", "raça", 2, "femea", 456);
        Animal[] animais = {cachorro, gato};
        
        Produto produto = new Produto("Ração", "Gold", "cachorro", 28.5, 200, "balcão J", 123);
        produto.adicionarQuantidade(10);
        System.out.println("Quantidade de " + produto.getNome() + ": " + produto.getQuantidade());
        produto.trocarlugar("prateleira B-6");
        
        System.out.println("");
        
        Cliente cliente = new Cliente(321, "Marcelo", 123, "Rua", 12345678);
        cliente.confirmarDados();
        
        System.out.println("");
        
        for (Animal animal2 : animais) {
			if (cliente.getIdAnimal() == animal2.getId()) {
				System.out.println(cliente.getNome() + " é dono do " + animal2.getNome());
			}
		}
    }
}

package com.collection_exception.acougue;

import java.util.ArrayList;
import java.util.List;


import com.collection_exception.model.Produto;
import com.collection_exception.servicoVenda.ServicoVenda;

public class App 
{
    public static void main( String[] args )
    {

        List<Produto> listaCarne = new ArrayList<Produto>();
        
        ServicoVenda servicoVenda = new ServicoVenda();
        
        Produto boi = new Produto(28, "Boi", 200);
        
        servicoVenda.addLista(listaCarne, boi);
        servicoVenda.getAllLista(listaCarne);
        System.out.println("--------------------------------------------");
        servicoVenda.addLista(listaCarne, new Produto(15, "Frango", 500));
        servicoVenda.getAllLista(listaCarne);
        System.out.println("--------------------------------------------");
        servicoVenda.addLista(listaCarne, new Produto(20, "Porco", 400));
        servicoVenda.getAllLista(listaCarne);
        System.out.println("--------------------------------------------");
        servicoVenda.addLista(listaCarne, new Produto(28, "Boi", 100));
        servicoVenda.getAllLista(listaCarne);
        System.out.println("--------------------------------------------");
        servicoVenda.deletelista(listaCarne, boi);
        servicoVenda.getAllLista(listaCarne);
    }
}

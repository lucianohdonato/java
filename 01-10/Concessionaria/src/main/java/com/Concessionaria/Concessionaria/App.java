package com.Concessionaria.Concessionaria;

import com.Concessionaria.baseDados.BaseDadosCarro;
import com.Concessionaria.baseDados.BaseDadosCliente;
import com.Concessionaria.baseDados.BaseDadosMoto;
import com.Concessionaria.servicoVenda.ServicoVendaImpl;

public class App 
{
    public static void main( String[] args )
    {
      BaseDadosCarro baseListaCarros= new BaseDadosCarro();
      BaseDadosMoto baseListaMotos= new BaseDadosMoto();
      BaseDadosCliente baseListaClientes= new BaseDadosCliente();
      
      ServicoVendaImpl servicoVendaImpl= new ServicoVendaImpl();
      
      System.out.println(servicoVendaImpl.venda(baseListaCarros.getListaCarros()[0], baseListaClientes.getListaClientes()[0]));
      System.out.println(servicoVendaImpl.venda(baseListaMotos.getListaMotos()[1], baseListaClientes.getListaClientes()[1]));
      
    
    }
}

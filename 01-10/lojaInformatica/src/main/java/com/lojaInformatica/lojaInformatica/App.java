package com.lojaInformatica.lojaInformatica;


import com.lojaInformatica.baseDados.BaseDadosCliente;
import com.lojaInformatica.baseDados.BaseDadosHeadphone;
import com.lojaInformatica.baseDados.BaseDadosMouse;
import com.lojaInformatica.baseDados.BaseDadosVendedor;
import com.lojaInformatica.servicoVenda.ServicoVenda;

public class App 
{
    public static void main( String[] args )
    {
        BaseDadosMouse baseDadosMouse = new BaseDadosMouse();
        BaseDadosHeadphone baseDadosHeadphone = new BaseDadosHeadphone();
        BaseDadosCliente baseDadosCliente = new BaseDadosCliente();
        BaseDadosVendedor baseDadosVendedor = new BaseDadosVendedor();
        
        ServicoVenda servicoVenda= new ServicoVenda();
        
        System.out.println(servicoVenda.venda(baseDadosMouse.getListaMouse()[0], baseDadosCliente.getListaClientes()[0], baseDadosVendedor.getListaVendedores()[0]));
        System.out.println(servicoVenda.cancelarVenda(baseDadosHeadphone.getListaHeadphone()[0], baseDadosCliente.getListaClientes()[1], baseDadosVendedor.getListaVendedores()[1]));
        
    }
}

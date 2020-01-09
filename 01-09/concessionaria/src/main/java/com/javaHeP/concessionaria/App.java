package com.javaHeP.concessionaria;

import com.javaHeP.Model.Carro;
import com.javaHeP.Model.CarroEsportivo;

public class App 
{
    public static void main( String[] args )
    {
        Carro carro = new Carro("Gol", 123, 10000, 12, "Preto", "ABC1234", "disponivel");
        CarroEsportivo carroEsportivo = new CarroEsportivo("Ferrare", 666, 250000, 1, "Vermelha", "DEM 6666", "Ultimo veiculo", 4, 350, "V8");
        
        System.out.println(carro.vender("vendido recentemente"));
        System.out.println("Quantidade atual: " + carro.getQuantidade());
        System.out.println("Nova quantidade: " + carro.alterarQuantidade(8));
        carroEsportivo.alterarQuantidade(1);
        
    }
}

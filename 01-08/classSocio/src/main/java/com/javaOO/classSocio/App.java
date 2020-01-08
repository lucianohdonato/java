package com.javaOO.classSocio;

public class App 
{
    public static void main( String[] args )
    {
    	Socio socio = new Socio();
    	Socio thiago = new Socio(null, null, null, null, null, null);
        Socio marcos = new Socio(null, null, null, null, null, null);
        Socio vitor = new Socio();
        
        socio.confirmarCadstro();
        socio.cadastrar("Joao", "11.111.111-2");
        socio.confirmarCadstro();
        socio.validarSocio("Migual", "123");
        socio.validarSocio("Joao", "11.111.111-2");
    }
}

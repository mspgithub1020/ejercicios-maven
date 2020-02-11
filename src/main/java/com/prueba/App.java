package com.prueba;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        Pelicula peli = new Pelicula("Unico", "drama", "clint eastwood", "Warner");

        peli.iniciar();





    }
}

interface IReproducible{

    public void iniciar();
    public void pausar();
    public void retroceder();
    public void avanzar();

}

abstract class Contenido{

    private String titulo;
    private String descripcion;
    private String director;
    private String productora;

    public Contenido(String titulo,String descripcion,String director,String productora){

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.director = director;
        this.productora = productora;


    }

}

class Pelicula extends Contenido implements IReproducible{


    public Pelicula (String titulo,String descripcion,String director,String productora){

        super(titulo,descripcion,director,productora);

    }

    public void iniciar(){System.out.println("inicio peli");}
    public void pausar(){}
    public void retroceder(){}
    public void avanzar(){}

}

class Serie extends Contenido{


    private ArrayList<Capitulo> capitulos = new ArrayList<Capitulo>();



    public Serie (String titulo,String descripcion,String director,String productora){

        super(titulo,descripcion,director,productora);

    }

}

class Capitulo implements IReproducible{

    public void iniciar(){}
    public void pausar(){}
    public void retroceder(){}
    public void avanzar(){}


}




package co.edu.udec.s2.EjercicioFestival.Domain.Model;

import java.util.List;

public class Escenario {

    // PROPIEDADES
    private String nombre;
    private int capacidad;
    private Artista artista;
    private List<Espectador> espectadores;

    // CONSTRUCTOR
    public Escenario(){
        
    }

    // CONSTRUCTORES CON PARAMETROS
    public Escenario(String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public Escenario(Artista artista, List<Espectador> espectadores){
        this.artista = artista;
        this.espectadores = espectadores;
    }

    public void datosEscenario(){
        System.out.println("El nombre del escenario: "+nombre);
        System.out.println("La cantidad de personas que pueden estar es: "+capacidad);
        System.out.println("El artista a presentarse es: "+artista);
        System.out.println("La lista de espectadores es: "+espectadores);
    }


}


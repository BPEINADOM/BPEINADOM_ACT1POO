package co.edu.udec.s2.EjercicioFestival.Domain.Model;

import java.util.Date;

public class Entrada {

    // PROPIEDADES
    private int id;
    private String tipo;
    private Date fecha;
    private Espectador espectador;
    private Concierto concierto;

    // CONSTRUCTOR
    public Entrada(){
        
    }

    // CONSTRUCTORES CON PARAMETROS
    public Entrada(int id, String tipo){
        this.id = id;
        this.tipo = tipo;
    }

    public Entrada(Date fecha){
        this.fecha = fecha;
    }

    public Entrada(Espectador espectador, Concierto concierto){
        this.espectador = espectador;
        this.concierto = concierto;
    }

    public void datosEntrada(){
        System.out.println("El ID de la entrada es "+id);
        System.out.println("El tipo de entrada es: "+tipo);
        System.out.println("La fecha de la entrada es "+fecha);
        System.out.println("El dueño de la entrada es: "+espectador);
        System.out.println("La entrada es del concierto: "+concierto);
    }

}


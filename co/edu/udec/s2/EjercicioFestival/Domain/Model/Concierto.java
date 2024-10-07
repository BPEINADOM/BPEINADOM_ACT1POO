package co.edu.udec.s2.EjercicioFestival.Domain.Model;

public class Concierto {

    // PROPIEDADES
    private String nombre;
    private int duracion;
    private Escenario escenario;
    private Artista artista;

    // CONSTRUCTOR
    public Concierto(){
        
    }

    // CONSTRUCTORES CON PARAMETROS
    public Concierto(String nombre, int duracion){
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Concierto(Escenario escenario){
        this.escenario = escenario;
    }

    public Concierto(Artista artista){
        this.artista = artista;
    }

    public void detallesConcierto(){
        System.out.println("El nombre del concierto es: "+nombre);
        System.out.println("La duracion del concierto es: "+duracion);
        System.out.println("El escenario del concierto es "+escenario);
        System.out.println("El artista del concierto es "+artista);
    }

}




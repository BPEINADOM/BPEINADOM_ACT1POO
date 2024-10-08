package co.edu.udec.s2.EjercicioFestival.Domain.Model;

public class Concierto {

    // PROPIEDADES
    private String nombre;
    private int duracion;

    // CONSTRUCTOR
    public Concierto(){
        
    }

    // CONSTRUCTORES CON PARAMETROS
    public Concierto(String nombre, int duracion){
        this.nombre = nombre;
        this.duracion = duracion;
    }


    public void detallesConcierto(){
        System.out.println("El nombre del concierto es: "+nombre);
        System.out.println("La duracion del concierto es: "+duracion);
    }


}




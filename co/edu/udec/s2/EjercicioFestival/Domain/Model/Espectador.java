package co.edu.udec.s2.EjercicioFestival.Domain.Model;

public class Espectador {

    // PROPIEDADES
    private String nombre;
    private int edad;
    private Entrada entrada;

    // CONSTRUCTOR
    public Espectador(){
        
    }

    // CONSTRUCTORES CON PARAMETROS
    public Espectador(String nombre, int edad, Entrada entrada){
        this.nombre = nombre;
        this.edad = edad;
        this.entrada = entrada;
    }

    public void datosEspectador(){
        System.out.println("Nombre del espectador: "+nombre);
        System.out.println("Edad del espectador: "+edad);
        System.out.println("Entrada del espectador: "+entrada);
    }

}



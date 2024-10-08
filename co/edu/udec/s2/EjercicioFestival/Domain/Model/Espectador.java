package co.edu.udec.s2.EjercicioFestival.Domain.Model;

public class Espectador {

    // PROPIEDADES
    private String nombre;
    private int edad;

    // CONSTRUCTOR
    public Espectador(){
        
    }

    // CONSTRUCTORES CON PARAMETROS
    public Espectador(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void datosEspectador(){
        System.out.println("Nombre del espectador: "+nombre);
        System.out.println("Edad del espectador: "+edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


}



package co.edu.udec.s2.EjercicioFestival.Domain.Model;

import java.util.Date;

public class Festival {

    // PROPIEDADES
    private String nombre;
    private String ubicacion;
    private Date fecha;

    // CONSTRUCTOR
    public Festival(){
        
    }

    // CONSTRUCTORES CON PARAMETROS
    public Festival(String nombre, String ubicacion, Date fecha){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
    }

    public void datosFestival(){
        System.out.println("El nombre del festival es: "+nombre);
        System.out.println("Ubicacion: "+ubicacion);
        System.out.println("Fecha: " + fecha.toString());
    }

}



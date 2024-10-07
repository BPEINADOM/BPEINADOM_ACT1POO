package co.edu.udec.s2.EjercicioFestival.Domain.Model;

public class Artista {

    // PROPIEDADES
    private String nombre;
    private String generomusical;
    private String nacionalidad;

    // CONSTRUCTOR
    public Artista(){
        
    }

    // CONSTRUCTORES CON PARAMETROS
    public Artista(String nombre, String generomusical, String nacionalidad){
        this.nombre = nombre;
        this.generomusical = generomusical;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre del artista es: "+nombre);
        System.out.println("El genero musical del artista es: "+generomusical);
        System.out.println("La nacionalidad del artista es: "+nacionalidad);
    }

}


package co.edu.udec.s2.EjercicioFestival.Domain.Model;

import java.util.ArrayList;
import java.util.List;

public class Escenario {

    // PROPIEDADES
    private String nombre;
    private int capacidad;
    private List<Espectador> espectadores;

    // CONSTRUCTOR POR DEFECTO
    public Escenario() {
        this.espectadores = new ArrayList<>(); // 
    }

    // CONSTRUCTOR CON PARÁMETROS
    public Escenario(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.espectadores = new ArrayList<>(); 
    }

    public void agregarEspectadores(Espectador espectador) {
        espectadores.add(espectador);
    }

    public void datosEscenario() {
        System.out.println("El nombre del escenario: " + nombre);
        System.out.println("La cantidad de personas que pueden estar es: " + capacidad);

        System.out.println("La lista de espectadores es: ");
        for (Espectador espectador : espectadores) {
            System.out.println("- " + espectador.getNombre() + " (" + espectador.getEdad() + " años)");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
}


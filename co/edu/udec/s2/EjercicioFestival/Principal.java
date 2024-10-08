package co.edu.udec.s2.EjercicioFestival;

import java.util.Date;

import co.edu.udec.s2.EjercicioFestival.Domain.Model.Artista;
import co.edu.udec.s2.EjercicioFestival.Domain.Model.Concierto;
import co.edu.udec.s2.EjercicioFestival.Domain.Model.Escenario;
import co.edu.udec.s2.EjercicioFestival.Domain.Model.Espectador;
import co.edu.udec.s2.EjercicioFestival.Domain.Model.Festival;

public class Principal {


    public static void main(String [] args){

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Date fechaFestival = new Date();

        Festival festival = new Festival("El rincon", "Centro de la ciudad", fechaFestival);
        festival.datosFestival();

        System.out.println("*********************************************");

        Artista artista = new Artista("Alejandro", "Vallenato", "Colombiano");
        artista.mostrarDatos();

        System.out.println("*********************************************");

        Concierto concierto = new Concierto("LolaPaluza", 14400);
        concierto.detallesConcierto();

        System.out.println("*********************************************");

        Escenario escenario = new Escenario("La Cumbre",10);

        Espectador espectador1 = new Espectador("Sebastian",19);
        Espectador espectador2 = new Espectador("Lucia",20);
        Espectador espectador3 = new Espectador("Carlos",18);
        Espectador espectador4 = new Espectador("Jose",22);
        Espectador espectador5 = new Espectador("Luis",21);

        escenario.agregarEspectadores(espectador1);
        escenario.agregarEspectadores(espectador2);
        escenario.agregarEspectadores(espectador3);
        escenario.agregarEspectadores(espectador4);
        escenario.agregarEspectadores(espectador5);

        escenario.datosEscenario();

        System.out.println("*********************************************");


    }

}

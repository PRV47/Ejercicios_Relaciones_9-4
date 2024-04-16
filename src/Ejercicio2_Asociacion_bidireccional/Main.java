package Ejercicio2_Asociacion_bidireccional;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Rodolfo Garcia");
        Persona p2 = new Persona("Francisco Murgo");

        Libro l1 = new Libro("Ready Player One");
        Libro l2 = new Libro("Misery");
        Libro l3 = new Libro("Algebra");
        Libro l4 = new Libro("Calculo con Geometria Analitica");
        Libro l5 = new Libro("Mercadotecnia");

        p1.agregarLibro(l1);
        p1.agregarLibro(l2);
        p2.agregarLibro(l3);
        p2.agregarLibro(l4);
        p2.agregarLibro(l5);
        System.out.println("---------------------------------");

        p1.mostrarLibros();
        p2.mostrarLibros();
        System.out.println("---------------------------------");

        l1.mostrarPersonas();
        l4.mostrarPersonas();
    }
}

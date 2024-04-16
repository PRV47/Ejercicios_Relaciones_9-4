package Ejercicio2_Asociacion_bidireccional;

import java.util.*;

public class Persona {
    String nombre;
    List<Libro> libros;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        libro.propietario.add(this);
    }
    public void mostrarLibros() {
        System.out.println("El usuario " + nombre + " tiene " + libros.size() + " libros, de los cuales son:");
        for (Libro libro : libros) {
            System.out.println(libro.titulo);
        }
    }
}

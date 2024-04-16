package Ejercicio2_Asociacion_bidireccional;

import java.util.*;

public class Libro {
    String titulo;
    List<Persona> propietario;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.propietario = new ArrayList<>();
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Persona> getPersonas() {
        return propietario;
    }

    public void setPersonas(List<Persona> personas) {
        this.propietario = personas;
    }

    public void mostrarPersonas() {
        System.out.println("El libro " + titulo + " está en la posesion de:");
        for (Persona persona : propietario) {
            System.out.println(persona.nombre);
        }
    }
}

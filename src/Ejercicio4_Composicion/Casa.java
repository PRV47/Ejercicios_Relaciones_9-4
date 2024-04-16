package Ejercicio4_Composicion;

import java.util.*;

public class Casa {
    List<Puerta> puertas;

    public Casa(String[] materiales) {
        this.puertas = new ArrayList<>();
        for (String material : materiales) {
            this.puertas.add(new Puerta(material));
        }
    }

    public List<Puerta> getPuertas() {
        return puertas;
    }

    public void setPuertas(List<Puerta> puertas) {
        this.puertas = puertas;
    }

    public void mostrarPuertas() {
        System.out.println("Nueva casa creada. La casa tendrá las siguientes puertas:");
        for (Puerta puerta : puertas) {
            System.out.println("Puerta de " + puerta.material);
        }
    }
}

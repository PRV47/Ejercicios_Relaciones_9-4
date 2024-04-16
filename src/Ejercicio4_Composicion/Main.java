package Ejercicio4_Composicion;

public class Main {
    public static void main(String[] args) {
        String[] materiales = {"madera", "metal", "vidrio"};
        Casa casa = new Casa(materiales);
        casa.mostrarPuertas();
    }
}

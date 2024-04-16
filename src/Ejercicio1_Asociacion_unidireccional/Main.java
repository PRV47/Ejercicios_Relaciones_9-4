package Ejercicio1_Asociacion_unidireccional;

public class Main {
    public static void main(String[] args) {
        Universidad uni1 = new Universidad("Universidad del Aconcagua");
        Universidad uni2 = new Universidad("Universidad Tecnologica Nacional");

        Estudiante est1 = new Estudiante("Cristian Perez", uni1);
        Estudiante est2 = new Estudiante("Maria Rueda", uni2);

        System.out.println(est1.getNombre() + " asiste a " + est1.getUniversidad().getNombre());
        System.out.println(est2.getNombre() + " asiste a " + est2.getUniversidad().getNombre());

        est1.setUniversidad(uni2);
        System.out.println(est1.getNombre() + " ahora asiste a " + est1.getUniversidad().getNombre());
    }
}

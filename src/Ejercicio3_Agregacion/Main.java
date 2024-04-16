package Ejercicio3_Agregacion;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Miguel Garcia", "Contador");
        Empleado empleado2 = new Empleado("Victor Morales", "Secretario");
        Empleado empleado3 = new Empleado("Javier Contreras", "Administrador");

        Departamento departamento1 = new Departamento("Ventas");
        Departamento departamento2 = new Departamento("RRHH");
        departamento1.agregarEmpleado(empleado1);
        departamento2.agregarEmpleado(empleado2);
        departamento2.agregarEmpleado(empleado3);

        Empresa empresa = new Empresa();
        empresa.agregarDepartamento(departamento1);
        empresa.agregarDepartamento(departamento2);

        empresa.mostrarDepartamentos();
    }
}

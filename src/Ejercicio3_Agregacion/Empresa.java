package Ejercicio3_Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    List<Departamento> departamentos;

    public Empresa() {
        this.departamentos = new ArrayList<>();
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void mostrarDepartamentos() {
        for (Departamento departamento : departamentos) {
            departamento.mostrarEmpleados();
        }
    }
}

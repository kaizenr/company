package Compani;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> listaEmpleados;  

   
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

 
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

 
    public void eliminarEmpleado(String nombre) {
        listaEmpleados.removeIf(e -> e.getNombre().equals(nombre));
    }

  
    public void listarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado e : listaEmpleados) {
                System.out.println("Nombre: " + e.getNombre() + ", Edad: " + e.getEdad() +
                        ", Salario Base: " + e.getSalarioBase() + ", Comisiones: " + e.getComisiones());
            }
        }
    }

  
    public double calcularNominaTotal() {
        double nominaTotal = 0;
        for (Empleado e : listaEmpleados) {
            nominaTotal += e.calcularSalarioTotal();
        }
        return nominaTotal;
        }
    
}

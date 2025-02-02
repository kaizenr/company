package Compani;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Mi Empresa");

        boolean continuar = true;

        while (continuar) {
            String opcion = JOptionPane.showInputDialog(null, 
                "Menú:\n" +
                "1. Agregar empleado\n" +
                "2. Eliminar empleado\n" +
                "3. Listar empleados\n" +
                "4. Calcular nómina total\n" +
                "5. Salir\n" +
                "Seleccione una opción:", "Menú Principal", JOptionPane.QUESTION_MESSAGE);

            int opcionInt = Integer.parseInt(opcion);

            switch (opcionInt) {
                case 1: 
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                    String edadStr = JOptionPane.showInputDialog("Ingrese la edad del empleado:");
                    int edad = Integer.parseInt(edadStr);  

                    String salarioBaseStr = JOptionPane.showInputDialog("Ingrese el salario base del empleado:");
                    double salarioBase = Double.parseDouble(salarioBaseStr); 

                    String comisionesStr = JOptionPane.showInputDialog("Ingrese las comisiones del empleado:");
                    double comisiones = Double.parseDouble(comisionesStr); 

                    
                    Empleado empleado = new Empleado(nombre, edad, salarioBase, comisiones);
                    empresa.agregarEmpleado(empleado);
                    JOptionPane.showMessageDialog(null, "Empleado agregado exitosamente.");
                    break;

                case 2: 
                    String nombreEliminar = JOptionPane.showInputDialog("Ingrese el nombre del empleado a eliminar:");
                    empresa.eliminarEmpleado(nombreEliminar);
                    JOptionPane.showMessageDialog(null, "Empleado eliminado (si existía).");
                    break;

                case 3: 
                    empresa.listarEmpleados();
                    break;

                case 4: 
                    double nominaTotal = empresa.calcularNominaTotal();
                    JOptionPane.showMessageDialog(null, "La nómina total de la empresa es: " + nominaTotal);
                    break;

                case 5:
                    continuar = false;  
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente de nuevo.");
                    break;
            }
        }
    }
}

import javax.swing.JOptionPane;

import clasesobjetos.Empleado;
import clasesobjetos.Empresa;

public class AppEmpresaObjetos {
    public static void main(String[] args) throws Exception {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Empleados: "));
        Empresa empresa = new Empresa();
        for(int emp = 0; emp < cantidad; emp++){
            String nombre = JOptionPane.showInputDialog(null,"Ingrese el Nombre del Empleado: ");
            String cargo = JOptionPane.showInputDialog(null,"Ingrese el Cargo del Empleado: ");
            Double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del Empleado: "));

            empresa.contratarEmpleado(new Empleado(nombre, cargo, salario));

        }
        System.out.println("\nEl numero total de Empleados es :"+empresa.GetTotalEmpleados());
        System.out.println("\nLos nombres y los salarios de los empleados son: ");
        empresa.NombreSalario();

        System.out.println("\nTotal de dinero pagado a todos los empleados: "+empresa.getTotalSalarios());

        empresa.empleadoMayorSalario();
        empresa.EmpleadoMenorSalario();
    }
}

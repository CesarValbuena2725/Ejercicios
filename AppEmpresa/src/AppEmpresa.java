
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AppEmpresa {
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> cargos = new ArrayList<String>();
        ArrayList<Double> salarios = new ArrayList<Double>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));

        for (int emp = 0; emp < cantidad; emp++)
        {
            String nombreEmp = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
            String cargoEmp = JOptionPane.showInputDialog("Ingrese el cargo del empleado");
            double salarioEmp = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado"));

            nombres.add(nombreEmp);
            cargos.add(cargoEmp);
            salarios.add(salarioEmp);

        }

        System.out.println("El numero de empleados es de: " + cantidad);

            System.out.println("Los nombres y los salarios de los empleados son: ");
            
            for(int i = 0; i < cantidad; i++)
            {
                System.out.println(nombres.get(i) + " " + salarios.get(i));
            }

        double total = 0;

        for (int j = 0; j < cantidad; j++)
        {
            total = total + salarios.get(j);
        }

        System.out.println("Total de dinero pagado a los empleados: " + total);

        System.out.println("El empleado que mas dinero gana es: ");

        double mayorSalario = salarios.get(0);

        int posicion = 0;

        for(int j = 1; j < cantidad; j++)
        {
            if (salarios.get(j) > mayorSalario)
            {
                mayorSalario = salarios.get(j);
                posicion = j;
            }
        }
        System.out.println(nombres.get(posicion) + " y gana " + mayorSalario + "$");
        

        
    }
}

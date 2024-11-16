package clasesobjetos;

import java.util.ArrayList;
public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<Empleado>();
    }
    public void contratarEmpleado(Empleado e){
        empleados.add(e);
    }
    public int GetTotalEmpleados(){
        return empleados.size();
    }
    public void NombreSalario(){
        for(Empleado e: empleados){
            System.out.println("El Nombre del empleado es: " + e.getnombre() + " Cargo:" +e.getcargo()+ " Salario: " + e.getsalario());
        }
    }
    public double getTotalSalarios(){
        double total = 0;
        for(Empleado e: empleados){
            total +=e.getsalario();
        }
        return total;
    }
    public void empleadoMayorSalario(){
        Empleado EmpleadoMayorSalario = empleados.get(0);
        double maxsalario = empleados.get(0).getsalario();
        for(Empleado e: empleados){
            if(e.getsalario() > maxsalario){
                maxsalario = e.getsalario();
                EmpleadoMayorSalario = e;
            }
        }
        System.out.println("El empleado que mas dinero gana es: ");
        System.out.println("Nombre: "+EmpleadoMayorSalario.getnombre());
        System.out.println("Cargo: "+EmpleadoMayorSalario.getcargo());
        System.out.println("Salario "+EmpleadoMayorSalario.getsalario());
    }
    public void EmpleadoMenorSalario(){
        Empleado EmpleadoMenorSalario = empleados.get(0);
        double minsalario = empleados.get(0).getsalario();
        for(Empleado e: empleados){
            if(e.getsalario() < minsalario){
                minsalario = e.getsalario();
                EmpleadoMenorSalario = e;
            }
        }
        System.out.println("El empleado que mas dinero gana es: ");
        System.out.println("Nombre: "+EmpleadoMenorSalario.getnombre());
        System.out.println("Cargo: "+EmpleadoMenorSalario.getcargo());
        System.out.println("Salario "+EmpleadoMenorSalario.getsalario());
    }
}

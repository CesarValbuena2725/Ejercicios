package clasesobjetos;

public class Empleado {
    
    private String nombre;
    private String cargo;
    private Double salario;
    
    public Empleado(){

    }
    public Empleado(String nom, String car, Double sal){
       this.nombre = nom;
       this.cargo = car;
       this.salario = sal;
    }
    public void setnombre(String nom){
        this.nombre = nom;
    }
    public String getnombre(){
        return nombre;
    }
    public void setcargo(String car){
        this.cargo = car;
    }
    public String getcargo(){
        return cargo;
    }
    public void setsalario(double sal){
        this.salario = sal;
    }
    public double getsalario(){
        return salario;
    }
    
}

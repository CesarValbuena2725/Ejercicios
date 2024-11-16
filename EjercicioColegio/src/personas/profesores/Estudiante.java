package personas.profesores;

public class Estudiante extends Persona{
    private String carrera;
    private int legajo;
    
    public Estudiante(){

    } 
    public Estudiante(String carrera, int legajo){
        this.carrera = carrera;
        this.legajo = legajo;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
    public String getCarrera(){
        return carrera;
    }
    public int getLegajo(){
        return legajo;
    }
}

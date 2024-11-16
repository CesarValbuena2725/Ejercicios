import java.util.Scanner;
import personas.profesores.*;

public class AppUniversidad {
    Persona persona;

    public static void main(String[] args) throws Exception {
        AppUniversidad appuniversidad = new AppUniversidad();
        appuniversidad.cargarpersona();
    }

    public void cargarpersona() {
        persona = new Persona();
        Scanner sc = new Scanner(System.in);

        Estudiante est = new Estudiante();
        System.out.println("Ingrese el nombre del estudiante:");
        est.setNombre(sc.nextLine());

        System.out.println("Ingrese la edad del estudiante:");
        est.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.println("Ingrese el legajo:");
        est.setLegajo(sc.nextInt());
        sc.nextLine(); // Consumir el salto de línea sobrante

        System.out.println("Ingrese la carrera:");
        est.setCarrera(sc.nextLine());

        Profesor profesor = new Profesor();
        System.out.println("Ingrese el nombre del profesor:");
        profesor.setNombre(sc.nextLine());

        System.out.println("Ingrese la edad del profesor:");
        profesor.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.println("Ingrese la materia:");
        profesor.setMateria(sc.nextLine());

        System.out.println("Ingrese el cargo:");
        profesor.setCargo(sc.nextLine());

        System.out.println("El estudiante:");
        System.out.println("Nombre: " + est.getNombre() + " Edad: " + est.getEdad() + " Legajo: " + est.getLegajo() + " Carrera: " + est.getCarrera());
        System.out.println("El profesor:");
        System.out.println("Nombre: " + profesor.getNombre() + " Edad: " + profesor.getEdad() + " Materia: " + profesor.getMateria() + " Cargo: " + profesor.getCargo());

        sc.close();
    }
}

import com.biblioteca.mantener.*;
import java.util.Scanner;

public class AppBiblioteca {

    Libro libro;
    public static void main(String[] args) throws Exception {
        AppBiblioteca appBiblioteca = new AppBiblioteca();
        appBiblioteca.cargarlibro();
        appBiblioteca.imprimir();
    }

    public void cargarlibro(){
        libro = new Libro();
        try(Scanner sc = new Scanner(System.in)) {
        System.out.println("Ingrese el codigo del libro: ");
        libro.setCodigo(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el nombre del libro: ");
        libro.setNombre(sc.next());
        sc.nextLine();
        System.out.println("Ingrese el numero de la edicion: ");
        libro.setEdicion(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el año de publicacion: ");
        libro.setAñoPublicacion(sc.nextInt());
        sc.nextLine();
        Autor aut = new Autor();
        System.out.println("Ingrese el codigo del autor: ");
        aut.setCodigo(sc.nextInt());
        System.out.println("Ingrese el nombre del autor: ");
        aut.setNombre(sc.next());
        sc.nextLine();
        System.out.println("Ingrese las observaciones: ");
        aut.setObservacion(sc.next());
        sc.nextLine();
        System.out.println("Ingrese los libros publicados por este autor: ");
        aut.setLibrosPublicados(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el pais de origen del autor: ");
        String paisNombre = sc.nextLine();
        Pais pais = new Pais(paisNombre);
        aut.setPais(pais);

        libro.setAutor(aut);
        }
    }

    public void imprimir(){
        System.out.println(libro);
    }
}

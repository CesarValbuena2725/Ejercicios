
import clases.Estudiante;

public class AppNotasObjetos {
    public static void main(String[] args) throws Exception {
        Estudiante est = new Estudiante("Carlos Rodriguez", Float.parseFloat("2.5"), Float.parseFloat("5.0"));
        Estudiante est2 = new Estudiante("Santiago Ibañez", Float.parseFloat("2.5"), Float.parseFloat("3.0"));

        est.calcularNotaFinal();
        est2.calcularNotaFinal();

        System.out.println("El estudiante " + est.obtenerNombre() + " tuvo una nota final de " + est.obtenerNotaFinal() + " por lo que el estudiante " + est.obtenerMensaje());
        System.out.println("El estudiante " + est2.obtenerNombre() + " tuvo una nota final de " + est2.obtenerNotaFinal() + " por lo que el estudiante " + est2.obtenerMensaje());
    }
}

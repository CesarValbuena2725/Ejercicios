
import javax.swing.JOptionPane;

public class AppNotasEstructurada {
    public static void main(String[] args) throws Exception {
        for(int est = 0; est < 2; est++)
        {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la primera nota"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la primera nota"));

            float NotaFinal = (nota1 + nota2) / 2;

            JOptionPane.showMessageDialog(null, "El estudiante " + nombre + " obtuvo una nota final de " + NotaFinal);
            if(NotaFinal <= 3)
            {
                JOptionPane.showMessageDialog(null, "El estudiante " + nombre + " reprobó");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El estudiante " + nombre + " aprobó");
            }
        }
    }
}

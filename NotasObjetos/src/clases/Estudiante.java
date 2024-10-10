package clases;

public class Estudiante {
    private String nombre;
    private float nota1;
    private float nota2;
    private float NotaFinal;

    public Estudiante(String nombre)
    {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, float nota1, float nota2)
    {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void asignarNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String obtenerNombre()
    {
        return nombre;
    }

    public void asignarNotaParcial1(float nota1)
    {
        this.nota1 = nota1;
    }

    public void asignarNotaParcial2(float nota2)
    {
        this.nota2 = nota2;
    }

    public float obtenerNotaParcial1(float nota1)
    {
        return this.nota1;
    }

    public float obtenerNotaParcial2(float nota2)
    {
        return this.nota2;
    }

    

    public void calcularNotaFinal()
    {
        this.NotaFinal = (this.nota1 + this.nota2)/2;
    }

    public float obtenerNotaFinal()
    {
        return this.NotaFinal;
    }

    public String obtenerMensaje()
    {
        if (NotaFinal <= 3)
        {
            return "Reprobó";
        }
        else
        {
            return "Aprobó";
        }
    }


}

package almacen.mantener;

public class Comprobante {
    private char tipo;
    private int numero;
    private Fecha fecha;
    
    public Comprobante(){

    }
    public Comprobante(char tipo, int numero, Fecha fecha){
        this.tipo = tipo;
        this.numero = numero;
        this.fecha = fecha;
    }
    public void setTipo(char tipo){
        this.tipo = tipo;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setFecha(Fecha fecha){
        this.fecha = fecha;
    }
    public char getTipo(){
        return tipo;
    }
    public int getNumero(){
        return numero;
    }
    public Fecha getFecha(){
        return fecha;
    }
}

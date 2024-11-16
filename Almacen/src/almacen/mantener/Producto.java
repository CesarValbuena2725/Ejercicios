package almacen.mantener;

public class Producto {
    private int codigo;
    private String Descripcion;
    private float precio;
    
    public Producto(){

    }
    public Producto(int codigo, String Descripcion, float precio){
        this.codigo = codigo;
        this.Descripcion = Descripcion;
        this.precio = precio;
    }
    public void setCodigop(int codigo){
        this.codigo = codigo;
    }
    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }
    public int getCodigop(){
        return codigo;
    }
    public String getDescripcion(){
        return Descripcion;
    }
    public float getPrecio(){
        return precio;
    }
}

package almacen.mantener;

public class Cliente {
    private int codigo;
    private String razonSocial;

    public Cliente(){

    }
    public Cliente(int codigo, String razonSocial){
        this.codigo = codigo;
        this.razonSocial = razonSocial;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setRazon(String razonSocial){
        this.razonSocial = razonSocial;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getRazon(){
        return razonSocial;
    }
}

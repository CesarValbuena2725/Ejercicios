package almacen.mantener;
import java.util.ArrayList;
/*import java.util.Iterator;*/

public class Factura extends Comprobante {
    private float total;
    private Cliente cliente;
    private ArrayList<Producto> producto = new ArrayList<>();


    public Factura(){
        
    }
    public Factura(char tipo, int numero, Fecha fecha, float total, Cliente cliente, ArrayList<Producto> producto) {
        super(tipo, numero, fecha);
        this.total = total;
        this.cliente = cliente;
        this.producto = producto; 
    }
    
    
    public void setTotal(float total){
        this.total = total;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void setProducto(ArrayList<Producto> producto){
        this.producto = producto;
    }
  
    public float getTotal(){
        return total;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public ArrayList<Producto> getProducto(){
        return producto;
    }

    public void AgregarProducto(Producto p){
        producto.add(p);
        setTotal(getTotal()+p.getPrecio());
    }
    public void MostrarProductos(){
        for (Producto p : producto) {
            System.out.println("Codigo: " + p.getCodigop() + " Descripcion: " + p.getDescripcion() + " Precio: " + p.getPrecio());
        }
    }
    
    public void Mostrar(){
        System.out.println("Tipo: " + getTipo() );
        System.out.println("Fecha " +getFecha());
        System.out.println("Cliente \n");    
        System.out.printf("Codigo: %d Razon Social: %s \n", cliente.getCodigo(), cliente.getRazon());
        System.out.println("Productos: \n");
        MostrarProductos();
        System.out.printf("Total: %6.2f \n", getTotal());
        
    }

}

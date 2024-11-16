import almacen.mantener.*;
import java.util.ArrayList;

public class AppAlmacen {
    public static void main(String[] args) throws Exception {
        Fecha hoy = new Fecha(20, 11, 2024);
        Producto producto1 = new Producto(1, "Cafe", (float)8.500);
        Producto producto2 = new Producto(2, "Papa", (float)3.700);
        Producto producto3 = new Producto(3, "Manzanas", (float) 3.800);
        Cliente cliente = new Cliente(1, "Juan");
        Factura F1 = new Factura('F', 1, hoy, 0, cliente, new ArrayList<>());
        F1.AgregarProducto(producto1);
        F1.AgregarProducto(producto2);
        F1.AgregarProducto(producto3);
        F1.Mostrar();
    }
}




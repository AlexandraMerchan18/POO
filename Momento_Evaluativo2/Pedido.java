import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Date fecha;
    private String numeroTarjeta;
    private ArrayList<Producto> productos;

    public Pedido(Cliente cliente, Date fecha, String numeroTarjeta) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.numeroTarjeta = numeroTarjeta;
        this.productos = new ArrayList<>();
    }

    // Añadir un producto al pedido
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Imprimir la información completa del pedido
    public void imprimirPedido() {
        System.out.println("Pedido realizado por: ");
        cliente.mostrarInfo();
        System.out.println("Fecha del pedido: " + fecha);
        System.out.println("Número de tarjeta: " + numeroTarjeta);

        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
}

package model;
import java.math.BigDecimal;
import java.util.Date;


public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private String tipoProducto;
    private Integer cantidad;
    private Date fechaRegistro;
    private Date fechaEntrega;
    private String bodegaEntrega;
    private BigDecimal precioEnvio;
    private String placaVehiculo;
    private String numeroGuia;

    public Producto(int id, String nombre, String descripcion, BigDecimal precio, String tipoProducto,
                    Integer cantidad, Date fechaRegistro, Date fechaEntrega, String bodegaEntrega,
                    BigDecimal precioEnvio, String placaVehiculo, String numeroGuia) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
        this.bodegaEntrega = bodegaEntrega;
        this.precioEnvio = precioEnvio;
        this.placaVehiculo = placaVehiculo;
        this.numeroGuia = numeroGuia;
    }

    public Producto registrarProducto(Cliente cliente) {
        // Implementación del método para registrar un producto
        return new Producto(0, "", 0, null, null, "", 0.0, "", "", cliente);
    }

    public Producto buscarProducto(Cliente cliente, int idProducto) {
        // Implementación del método para buscar un producto
        return null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        // Implementación del método toString
        return "";
    }
}

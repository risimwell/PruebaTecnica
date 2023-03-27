package model;

import java.util.Date;

public class Producto {
    private int id;
    private String tipo;
    private int cantidad;
    private Date fechaRegistro;
    private Date fechaEntrega;
    private String bodegaEntrega;
    private double precioEnvio;
    private String placaVehiculo;
    private String numeroGuia;
    private Cliente cliente;

    public Producto(int id, String tipo, int cantidad, Date fechaRegistro, Date fechaEntrega,
                    String bodegaEntrega, double precioEnvio, String placaVehiculo, String numeroGuia,
                    Cliente cliente) {
        this.id = id;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
        this.bodegaEntrega = bodegaEntrega;
        this.precioEnvio = precioEnvio;
        this.placaVehiculo = placaVehiculo;
        this.numeroGuia = numeroGuia;
        this.cliente = cliente;
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

package model;

import java.util.Date;

public class EntregaMaritima {
    private int id;
    private int clienteId;
    private int productoId;
    private String puertoOrigen;
    private String puertoDestino;
    private Date fechaRegistro;
    private Date fechaEntrega;
    private double precioEnvio;
    private String naviera;
    private String numeroGuia;

    public EntregaMaritima(int clienteId, int productoId, String puertoOrigen, String puertoDestino, Date fechaRegistro,
                           Date fechaEntrega, double precioEnvio, String naviera, String numeroGuia) {
        this.clienteId = clienteId;
        this.productoId = productoId;
        this.puertoOrigen = puertoOrigen;
        this.puertoDestino = puertoDestino;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
        this.precioEnvio = precioEnvio;
        this.naviera = naviera;
        this.numeroGuia = numeroGuia;
    }

    public int getId() {
        return id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public int getProductoId() {
        return productoId;
    }

    public String getPuertoOrigen() {
        return puertoOrigen;
    }

    public String getPuertoDestino() {
        return puertoDestino;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public String getNaviera() {
        return naviera;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setId(int id) {
        this.id = id;
    }

    // otros métodos, como registrar entrega marítima y consultar entrega marítima por número de guía
}
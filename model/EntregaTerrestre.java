package model;

import java.time.LocalDate;

public class EntregaTerrestre {
    private int id;
    private String placaVehiculo;
    private LocalDate fechaEntrega;
    private String lugarEntrega;
    private String numeroGuia;
    
    // Constructor
    public EntregaTerrestre(int id, String placaVehiculo, LocalDate fechaEntrega, String lugarEntrega, String numeroGuia) {
        this.id = id;
        this.placaVehiculo = placaVehiculo;
        this.fechaEntrega = fechaEntrega;
        this.lugarEntrega = lugarEntrega;
        this.numeroGuia = numeroGuia;
    }
    
    // Getters y Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getPlacaVehiculo() {
        return placaVehiculo;
    }
    
    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }
    
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }
    
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    public String getLugarEntrega() {
        return lugarEntrega;
    }
    
    public void setLugarEntrega(String lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }
    
    public String getNumeroGuia() {
        return numeroGuia;
    }
    
    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }
    
    // Métodos
    public void realizarEntrega() {
        // Lógica para realizar la entrega terrestre
    }
}
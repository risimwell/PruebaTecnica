package model;
import java.math.BigDecimal;
import java.util.Date;

import basededatos.PersonaDao;


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

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getBodegaEntrega() {
		return bodegaEntrega;
	}

	public void setBodegaEntrega(String bodegaEntrega) {
		this.bodegaEntrega = bodegaEntrega;
	}

	public BigDecimal getPrecioEnvio() {
		return precioEnvio;
	}

	public void setPrecioEnvio(BigDecimal precioEnvio) {
		this.precioEnvio = precioEnvio;
	}

	public String getPlacaVehiculo() {
		return placaVehiculo;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}

	public String getNumeroGuia() {
		return numeroGuia;
	}

	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = numeroGuia;
	}

	public boolean registrarProducto(Producto producto) {
        PersonaDao productoDao = new PersonaDao();
        return productoDao.registrarProducto(this);
    }

    public Producto buscarProducto(Cliente cliente, int idProducto) {
        // Implementación del método para buscar un producto
        return null;
    }

  
 

    @Override
    public String toString() {
        // Implementación del método toString
        return "";
    }
}

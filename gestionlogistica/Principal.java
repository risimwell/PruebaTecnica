package gestionlogistica;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;
import model.Cliente;
import model.EntregaMaritima;
import model.EntregaTerrestre;
import model.Producto;
import javax.swing.JOptionPane;
import basededatos.PersonaDao;
import basededatos.ConexionBD;
import model.Bodega;
import java.util.Date;





public class Principal {
	 public static void main(String[] args) throws SQLException {
		 
		 ConexionBD conexion = new ConexionBD();
		    Connection conn = conexion.obtenerConexion();
		    
		    if (conn != null) {
		        System.out.println("Conexión establecida");
		    } else {
		        System.out.println("Error al conectar");
		    }
		
	        boolean continuar = true;
	        while (continuar) {
	            String opcionStr = JOptionPane.showInputDialog(
	                    "Seleccione una opción:\n" +
	                            "1. Registrar cliente\n" +
	                            "2. Registrar bodega\n" +
	                            "3. Registrar puerto\n" +
	                            "4. Registrar envío terrestre\n" +
	                            "5. Registrar envío marítimo\n" +
	                            "6. Salir"
	            );
	            int opcion;
	            try {
	                opcion = Integer.parseInt(opcionStr);
	            } catch (NumberFormatException e) {
	                opcion = -1;
	            }
	            switch (opcion) {
	                case 1:
	                	String id = JOptionPane.showInputDialog(null, "Ingrese el Numero de cedula:");
	                    String nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre Completo :");
	                    String email = JOptionPane.showInputDialog(null, "Ingrese el correo electrónico del cliente:");
	                    String telefono = JOptionPane.showInputDialog(null, "Ingrese el telefono :");
	                   
	                    Cliente cliente = new Cliente(id,nombre, email,telefono);
	                    PersonaDao personaDao = new PersonaDao();
	                    if (personaDao.registrarCliente(cliente)) {
	                        JOptionPane.showMessageDialog(null, "El cliente se registró exitosamente");
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Error al registrar el cliente");
	                    }
	                    break;
	                    
	                case 2:
	                	
	                	String nombreBodega = JOptionPane.showInputDialog(null, "Ingrese el nombre de la bodega:");
	                    String direccionBodega = JOptionPane.showInputDialog(null, "Ingrese la dirección de la bodega:");
	                    Bodega bodega = new Bodega(nombreBodega, direccionBodega);
	                    bodega.registrarBodega();
	                    break;
	                	
	                	
	                
	                case 3:
	                    // Lógica para registrar un puerto marítimo
	                    break;
	                case 4:
	                	JOptionPane.showMessageDialog(null, "Ingrese los datos del producto:");

	                	int idProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del producto:"));
	                	String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
	                	String descripcionProducto = JOptionPane.showInputDialog("Ingrese la descripción del producto:");
	                	BigDecimal precioProducto = new BigDecimal(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
	                	String tipoProducto = JOptionPane.showInputDialog("Ingrese el tipo de producto:");
	                	int cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto:"));
	                	Date fechaRegistro = new Date();
	                	String bodegaEntrega = JOptionPane.showInputDialog("Ingrese la bodega de entrega:");
	                	BigDecimal precioEnvio = new BigDecimal(JOptionPane.showInputDialog("Ingrese el precio del envío:"));
	                	String placaVehiculo = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
	                	String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía:");

	                	Producto producto = new Producto(idProducto, nombreProducto, descripcionProducto, precioProducto, tipoProducto, cantidadProducto, fechaRegistro, null, bodegaEntrega, precioEnvio, placaVehiculo, numeroGuia);
	                	producto.registrarProducto();

	                case 5:
	                    // Lógica para registrar un envío marítimo
	                    break;
	                case 6:
	                    continuar = false;
	                    JOptionPane.showMessageDialog(null, "Hasta luego!");
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opción inválida, seleccione una opción válida.");
	                    break;
	            }
	        }
	    }
	}
package gestionlogistica;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import model.Cliente;
import model.EntregaMaritima;
import model.EntregaTerrestre;
import model.Producto;
import javax.swing.JOptionPane;
import basededatos.PersonaDao;

import basededatos.ConexionBD;





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
	                    // Lógica para registrar una bodega terrestre
	                    break;
	                case 3:
	                    // Lógica para registrar un puerto marítimo
	                    break;
	                case 4:
	                    // Lógica para registrar un envío terrestre
	                    break;
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
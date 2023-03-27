package basededatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;

public class PersonaDao {

    public boolean registrarCliente(Cliente persona) {
        boolean registrar = false;

        Connection con = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO clientes (id, nombre, email,telefono ) VALUES (?, ?, ?, ?)";

        try {
            con = ConexionBD.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, persona.getId());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getEmail());
            ps.setString(4, persona.getTelefono());
         

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                registrar = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al registrar la persona en la base de datos: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión con la base de datos: " + e.getMessage());
            }
        }

        return registrar;
    }
    
    public boolean registrarProducto(Producto producto) {
        boolean registrar = false;

        Connection con = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO productos (nombre, descripcion, precio, tipo_producto, cantidad, fecha_registro, fecha_entrega, bodega_entrega, precio_envio, placa_vehiculo, num_guia) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            con = ConexionBD.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio());
            ps.setString(4, producto.getTipoProducto());
            ps.setInt(5, producto.getCantidad());
            ps.setDate(6, new java.sql.Date(producto.getFechaRegistro().getTime()));
            ps.setDate(7, new java.sql.Date(producto.getFechaEntrega().getTime()));
            ps.setString(8, producto.getBodegaEntrega());
            ps.setDouble(9, producto.getPrecioEnvio());
            ps.setString(10, producto.getPlacaVehiculo());
            ps.setString(11, producto.getNumGuia());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                registrar = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al registrar el producto en la base de datos: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión con la base de datos: " + e.getMessage());
            }
        }

        return registrar;
    }

}



package model;
import basededatos.PersonaDao;

public class Cliente {
    private String id;
    private String nombre;
    private String email;
    private String telefono;
    
    // Constructor
    public Cliente( String id, String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
    
    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Métodos
    public boolean registrarCliente() {
        PersonaDao personaDao = new PersonaDao();
        return personaDao.registrarCliente(this);
    }

    public boolean login(String email, String cedula) {
        // Implementación del método para hacer login
        return true; // O false, dependiendo de la implementación real
    }
}

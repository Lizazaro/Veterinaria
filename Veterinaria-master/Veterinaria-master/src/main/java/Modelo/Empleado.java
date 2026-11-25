



package Modelo;





public class Empleado extends Persona {
    private String usuario;
    private String contraseña;
    
    
    public Empleado(String nombre, String cedula, String correo, String telefono, String usuario, String contraseña) {
        super(nombre, cedula, correo, telefono);
        this.usuario = usuario;
        this.contraseña = contraseña;            
        }
    
    public String getUsuario() {
        return usuario;
    }

    public boolean validarClave(String claveValidar) {
        return contraseña != null && contraseña.equals(claveValidar);
    }
}
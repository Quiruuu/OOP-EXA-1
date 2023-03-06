package clases_examen;
public class Password {
    private String usuario;
    private String contraseña;
    
    public Password(String usuario0, String contrasena0) {
        usuario = usuario0;
        contraseña = contrasena0;
    }
    
    public void setUsuario(String valor ){
        valor = usuario;
    }
    
    public void setontraseña(String valorr){
        valorr = contraseña;
        
    }
    
    public boolean verificarAcceso(String usuari, String contrasena) {
        return usuario.equals(usuari) && contraseña.equals(contrasena);
    }
}

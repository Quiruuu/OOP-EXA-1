package clases_examen;
public class FichaBibliografica {
    private String autor;
    private String titulo;
    private String editorial;
    private int anioPublicacion;
    private String ciudadPublicacion;
    
    public FichaBibliografica() {
        autor = "Gabriel García Márquez";
        titulo = "Cien años de soledad";
        editorial = "Editorial Sudamericana";
        anioPublicacion = 1967;
        ciudadPublicacion = "Buenos Aires";
    }
    
    public FichaBibliografica(String autorr, String titulor, String editorialr, int anioPublicacionr, String ciudadPublicacionr) {
        autor = autorr;
        titulo = titulor;
        editorial = editorialr;
        anioPublicacion = anioPublicacionr;
        ciudadPublicacion = ciudadPublicacionr;
    }
    
    public void setAutor(String autorr) {
        autor = autorr;
    }
    
    public void setTitulo(String titulor) {
        titulo = titulor;
    }
    
    public void setEditorial(String editorialr) {
        editorial = editorialr;
    }
    
    public void setAnioPublicacion(int anioPublicacionr) {
        anioPublicacion = anioPublicacionr;
    }
    
    public void setCiudadPublicacion(String ciudadPublicacionr) {
        ciudadPublicacion = ciudadPublicacionr;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getEditorial() {
        return editorial;
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public String getCiudadPublicacion() {
        return ciudadPublicacion;
    }
    
    public void imprimirFicha() {
        System.out.println(autor + " (" + anioPublicacion + "). " + titulo + ". " + ciudadPublicacion + ": " + editorial + ".");
    }
}

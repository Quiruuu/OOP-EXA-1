package clases_examen;
public class Pelicula {
     
    private String titulo;
    private String estudio;
    private int rating;
    
    public Pelicula(String titulo, String estudio, int rating) {
        this.titulo = titulo;
        this.estudio = estudio;
        this.rating = rating;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    public String getEstudio() {
        return estudio;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void imprimirDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Estudio: " + estudio);
        System.out.println("Rating: " + rating);
    }
    
    public void evaluarEdad(int edad) {
        if (edad >= 13) {
            System.out.println("Puedes ver la película");
        } else {
            System.out.println("No puedes ver la película");
        }
    }
    
}

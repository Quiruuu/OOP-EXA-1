package clases_examen;
public class Pelicula {
     
    private String _titulo;
    private String _estudio;
    private int _rating;

    public void setTitulo(String titulo) {
        _titulo = titulo;
    }

    public String getTitulo() {
        return _titulo;
    }

    public void setEstudio(String estudio) {
        _estudio = estudio;
    }

    public String getEstudio() {
        return _estudio;
    }

    public void setRating(int rating) {
        _rating = rating;
    }

    public int getRating() {
        return _rating;
    }

    public void imprimirDatos() {
        System.out.println("Título: " + _titulo);
        System.out.println("Estudio: " + _estudio);
        System.out.println("Rating: " + _rating);
    }

    public void evaluarEdad(int edad) {
        if (edad >= 13) {
            System.out.println("Puedes ver la película");
        } else {
            System.out.println("No puedes ver la película");
        }
    }
    
}

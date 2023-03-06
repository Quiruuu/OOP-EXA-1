package examen_1ra_evaluacion_vanilla_cream_pie;
import clases_examen.DatosIntegrantes;
import clases_examen.Password;
import clases_examen.Pelicula;
import clases_examen.FichaBibliografica;
import clases_examen.TestCovid;
import clases_examen.FIBONACCI;
public class EXAMEN_1RA_EVALUACION_VANILLA_CREAM_PIE {
    public static void main(String[] args) {
        ////////////////////////////
        DatosIntegrantes.imprimirDatosEquipo();
        DatosIntegrantes.imprimirProblemasResueltos();
        //////////////////////////
        System.out.println("------------------------------------------");
        System.out.println("CLASE CONTRASEÑA");
        Password password1 = new Password("SoyDios", "uwu123");
        if(password1.verificarAcceso("SoyDios", "uwu123")) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("XXXX Acceso denegado XXXX");
        }
        Password password2 = new Password("Quiru", "fortinaiti");
        if(password2.verificarAcceso("Quiroz", "fornai")) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("XXXX Acceso denegado XXXX");
        }
        /////////////////////////
        System.out.println("------------------------------------------");
        System.out.println("CLASE PELICULA");
        Pelicula pelicula = new Pelicula();
        pelicula.setTitulo("Gato con botas: el último deseo");
        pelicula.setEstudio("DreamWorks");
        pelicula.setRating(73);

        pelicula.imprimirDatos();
        pelicula.evaluarEdad(19);
        /////////////////////////
        System.out.println("------------------------------------------");
        System.out.println("CLASE FICHA BIBLIOGRÁFICA");
        FichaBibliografica libro1 = new FichaBibliografica();
        
        System.out.println("Ficha bibliográfica del libro:");
        libro1.imprimirFicha();
        
        FichaBibliografica otroLibro = new FichaBibliografica("J.K. Rowling", "Harry Potter y la piedra filosofal", "Salamandra", 1997, "Barcelona");
        
        System.out.println("\nFicha bibliográfica de otro libro:");
        otroLibro.imprimirFicha();
        /////////////////////////
        System.out.println("------------------------------------------");
        TestCovid Test1 = new TestCovid(18, 64, 1.82, false);
        Test1.calcularPersonaRiesgo();
        /////////////////////////
        System.out.println("------------------------------------------");
        System.out.println("FIBONACCI");
        FIBONACCI serie1 = new FIBONACCI();
        serie1.Serie();
        FIBONACCI serie2 = new FIBONACCI(13, 21, 5);
        serie2.Serie();
        System.out.println("------------------------------------------");
    }
    
}

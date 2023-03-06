package clases_examen;
public class TestCovid {
    private int Edad;
    private double Peso;
    private double Estatura;
    private Boolean EnferCronic; 

    public TestCovid(int age, double weight, double height, Boolean ill){
        Edad = age;
        Peso = weight;
        Estatura = height;
        EnferCronic = ill;
    }
    public void setEdad(int val) {
        Edad = val;
    }
    
    public int getEdad() {
        return Edad;
    }
    public void setPeso(double w) {
        Peso = w;
    }
    
    public double getPeso() {
        return Peso;
    }
    public void setEstatura(double h) {
        Estatura = h;
    }
    
    public double getEstatura() {
        return Estatura;
    }
    public void setEnferCronic(Boolean n) {
        EnferCronic = n;
    }
    public Boolean getEnferCronic() {
        return EnferCronic;
    }
    
        
    
    public void calcularPersonaRiesgo(){
        double IMC = Peso/(Estatura*Estatura);
        if(IMC < 30 && Edad < 65 && EnferCronic == false) System.out.println("PERSONA SIN RIESGO");
        else System.out.println("PERSONA DE RIESGO");
    }
}

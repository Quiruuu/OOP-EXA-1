package clases_examen;
public class FIBONACCI {
    private int a1;
  private int a2;
  private int n;
  
  //CONSTRUCTORES:
  //CODIFICADOR DE ACCESO NOMBRE DE LA CLASE (ARGUMENTOS)
  public FIBONACCI(){
      n = 6;
      a1 = 1;
      a2 = 1;
      
  }
  public  FIBONACCI(int v1, int v2, int i){
      n = i;
      a1 = v1;
      a2 = v2;
    }
    public void setN(int val) {
      n = val;
  }
  
  public int getN() {
      return n;
  }
  
  public void setA1(int val) {
      a1 = val;
  }
  
  public int getA1() {
      return a1;
  }
  
  public void setA2(int val) {
      a2 = val;
  }
  
  public int getA2() {
      return a2;
  }
  public void Serie() {
    int val1 = a1;
    int val2 = a2;
    System.out.print(val1+ " " +val2);
    for (int i = 2; i < n; i++) {
        int val3 = val1 + val2;
        System.out.print(" " +val3);
        val1 = val2;
        val2 = val3;
    }
    System.out.println();
  }
}

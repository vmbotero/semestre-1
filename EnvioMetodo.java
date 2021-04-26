public class EnvioMetodo{
  public static void main(String args[]) {
    int[] arr_edades = new int[3];
    arr_edades[0] = 18;
    arr_edades[1] = 25;
    arr_edades[2] = 30;
    double prom = EnvioMetodo.promedio(arr_edades);
    System.out.println(prom);
  }
 
  public static double promedio(int[] edades){
    double suma = 0;
    for(int i = 0; i < edades.length; i++){
      suma = suma + edades[i];
    }
    return suma/edades.length;
  }
}
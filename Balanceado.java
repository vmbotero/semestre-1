import java.util.Scanner;
import java.util.ArrayList;
public class Balanceado{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("ingrese la cantidad del arreglo");
        int cant = scan.nextInt();
        int[] a = new int[cant];
        for (int i=0;i<cant; i++){
        System.out.println("Ingrese el valor de la posicion"+i);
        a[i] = scan.nextInt();
}
Balanceado.balancear(a);
}
public static boolean balancear(int[]arr){
    int contuno = 0;
    int contdos = 0;
    int a= arr.length;
    int calc = ((arr.length)/2);
    for(int i= 0; i<calc; i++){
        contuno = contuno + arr[i];
        //System.out.println(i);
}
   for(int i=calc; i<arr.length-1; i++){
        contdos = contdos + arr[i+1];
        //System.out.println(i);
}
if(contuno==contdos){
    System.out.println(contuno);
    return(true);
}
else{
     System.out.println("No esta balanceado");
    return(false);
}
}
}
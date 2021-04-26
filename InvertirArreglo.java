import java.util.Scanner;
import java.util.ArrayList;
public class InvertirArreglo
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("ingrese la cantidad del arreglo");
        int cant = scan.nextInt();
        int[] a = new int[cant];
        for (int i=0;i<cant; i++){
        System.out.println("Ingrese el valor de la posicion"+i);
        a[i] = scan.nextInt();
    }
    InvertirArreglo.invertir(a);
    InvertirArreglo.imprimir(a);
}
    
    public static int[] invertir (int[]arr){
        int j= arr.length-1;
        int temp;
        for(int i=0; i< arr.length/2; i++){
            temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            j--;
    } 
     return arr;
    
}

    public static void imprimir (int[]arr){
        for(int i=0; i< arr.length-1; i++){
        System.out.print(arr[i]+",");
    }
    System.out.print(arr.length-(arr.length-1));
} 
} 
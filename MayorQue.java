import java.util.Scanner;
import java.util.ArrayList;
public class MayorQue
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
MayorQue.Mayor(a);
        
}

    public static void Mayor(int[]arr){
        int numinicial = arr[0];
        for (int i=0;i<arr.length; i++){
            if(arr[i]> numinicial){
              System.out.println(arr[i]);  
        }
}
}
}

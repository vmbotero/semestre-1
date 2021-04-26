import java.util.Scanner;
import java.util.ArrayList;
public class Sortario
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
    Sortario.detectorDeMalaSuerte(a);
    }
    
    public static boolean detectorDeMalaSuerte(int[]arr){
        int uno = 0;
        int tres = 0;
        for (int i =0; i<arr.length; i++){
            if(arr[i]==1){
                uno= +1; 
    }   
              else if(arr[i]==3){
                tres= +1; 
    }  
}
        //System.out.println(uno);
        //System.out.println(tres);
        if ((uno!=0) && (tres!=0)){
            System.out.println("Tiene mala suerte");
            return(true);
        }
        else{
            System.out.println("No tiene mala suerte");
            return(false);
        }
}
}
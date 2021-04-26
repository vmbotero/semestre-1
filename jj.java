
import java.util.Scanner;
public class jj
{
    public static void main(String[] args){
        System.out.println("Ingrese un entero no negativo, ");
        System.out.println("o un entero negativo para parar: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while(num>0){
        System.out.println("Ingrese un entero no negativo, ");
        System.out.println("o un entero negativo para parar: ");
        num = scan.nextInt();
        }
       System.out.println("Fin programa");
    }
}
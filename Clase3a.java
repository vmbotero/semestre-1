
import java.util.Scanner;
public class Clase3a{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese los creditos aprobados: ");
        int temp = scan.nextInt();
        if(temp >= 120){
            System.out.println("Graduado");
        }
        else{
            System.out.println("No se gradua");
        }
        System.out.println("Fin programa");
    }
}
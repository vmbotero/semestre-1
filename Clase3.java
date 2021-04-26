import java.util.Scanner;
public class Clase3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la temperatura; ");
        int temp = scan.nextInt();
        if(temp > 30){
            System.out.println("Comprar helado (cerveza)");
            System.out.println("Comprar limonada (otra cerveza)");
        }
        System.out.println("Fin programa");
    }
}


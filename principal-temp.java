
import java.util.Scanner;
       public class principal {
        public static void main(String[] arg) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese la temperatura: ");
            int temp = scan.nextInt();
            System.out.println("Ingrese el dinero");
            int dinero = scan.nextInt();
            if(temp > 27){
                if(dinero > 5){
                System.out.println("Comprar helado (cerveza)");
            }
            System.out.println("fin programa");
        }
    }
}
import java.util.Scanner;
public class Clase4b
{
   public static void main(String[] args){
Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese un numero:");
int num = scan.nextInt();
int i = 0;
        
        while(num != 0){
            System.out.println(i);
            i= num+i;
            if (num< 0){
                i = num-i;
               System.out.println(i);
            }
            if (num == 0){
                
               System.out.println(i);
            }
            num= scan.nextInt();
          
        
   
}
}
}

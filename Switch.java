import java.util.Scanner;
public class Switch{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Ingrese la nota: ");
int nota = scan.nextInt();

switch(nota){
case 10:
System.out.println("Teso");
break;
case 9:
System.out.println("Tesito");
break;
case 8:
System.out.println("Vas bien");
break;
default:
System.out.println("Puedes mejorar");
break;
}
}
}
            

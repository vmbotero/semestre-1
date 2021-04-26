import java.util.Scanner;
public class Arreglos{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int[] Arreglo = new int[3];
for (int i=0;i<3; i++){
System.out.println("Ingrese el valor de la posicion"+i);
Arreglo[i] = scan.nextInt();
}
for (int i=0;i<3; i++){
System.out.println(Arreglo[i]);
}
}
}
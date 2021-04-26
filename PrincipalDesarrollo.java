import java.util.Scanner;
//, Procesamiento y Persistencia/
public class PrincipalDesarrollo
{
    public static void main(String[] args){
        int i = 0;
        while(true){
            i++;
        Scanner scan = new Scanner(System.in); 
        System.out.println("ingrese su codigo de estudiante");
        String codigo = scan.next();
        System.out.println("Bienvenido a PlasticEAFIT usuario: " + codigo);
        System.out.println("Que desea hacer");
        System.out.println("Digite 1 para ingresar material o 2 para canjear");
        int proceso= scan.nextInt();
         if(proceso==1){
         System.out.println("Ingrese el material plastico");
         double peso = scan.nextDouble();
         Desarrollo.Conversion(peso);
          }
        
         if(proceso==2){
         Desarrollo.Acumulado();
         System.out.println("Digite 1,2 o 3 para canjear Bono-regalos");
         
        int canjeo = scan.nextInt();
            if(canjeo == 1){
            double p = 13;
            Desarrollo.Resta(p);}
            if(canjeo == 2){
            double p = 10;
            Desarrollo.Resta(p);}
            if(canjeo == 3){
            double p = 17;
            Desarrollo.Resta(p);}
            //if(canjeo { System.out.println("Numero Invalido");}
    }
}
}
}
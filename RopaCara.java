import java.util.Scanner;
public class RopaCara
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double acumuladorp=0;
        double acumuladorc=0;
for(; ;){
            String tipoderopa= scan.next();
            if((!tipoderopa.equals("pantalon")||(!tipoderopa.equals("camisa")))){
                break;
            }
            double precioropa = scan.nextDouble();
            if (tipoderopa.equals("pantalon")){
                acumuladorp= acumuladorp + precioropa;
}

            if (tipoderopa.equals("camisa")){
                acumuladorc= acumuladorc + precioropa;
}
}

System.out.println("Precio acumulado de pantalones: " + acumuladorp);
System.out.println("Precio acumulado de camisas: " + acumuladorc);

            if (acumuladorc>100){
               System.out.println("Balenciaga, Gucci, Prada "); 
}
}
}

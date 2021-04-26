import java.util.Scanner;
public class PrincipalSensor
{
    public static void main (String [] args){
        SensorLuz sl1 =new SensorLuz(18,40);
        Scanner scan = new Scanner(System.in);
        
        String texto;
           int i;
        do {texto = scan.next();
        if(texto.equals("duplicar")){
            System.out.println(sl1.getIntensidad());
            sl1.duplicarIntensidad();
            System.out.println(sl1.getIntensidad());
        }
        else if(texto.equals("asignarint")){
        i= scan.nextInt();
        sl1.setIntensidad(i);
    }
}while(!texto.equals("salir")); 
        
}
}




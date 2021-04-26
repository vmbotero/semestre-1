import java.util.Scanner;
public class PrincipalPropiedad
{
     public static void main (String [] args){
        Propiedad p1 =new Propiedad("nueva");
        Scanner scan = new Scanner(System.in);
        
        p1.aumentarVisitas();
        p1.aumentarVisitas();
        p1.aumentarVisitas();
        
        p1.setCondicion();
        
}
}
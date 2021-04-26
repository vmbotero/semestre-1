public class ArreglosParte2
{
public static void main(String[] args){
int[] arr_edades = {50,20,30,10,40};
int pos = -1;
int buscar = 30;
for(int i=0; i<arr_edades.length; i++){
if(buscar==arr_edades[i]){
pos = i;
break;
}
}
System.out.print("La posición en la que se encuentra ");
System.out.print(buscar+" es: "+pos);
}
}



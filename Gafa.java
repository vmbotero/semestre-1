public class Gafa
{
private String nombre;
private double precio;
public static final int IVA = 19;
public static final int ENVIO = 2000;



public Gafa(String n, double p){
this.nombre = n;
this.precio = p;
}

public static void imprimirDatosGenerales(){
System.out.println("Todos los productos vendidos tiene un iva de : ");
System.out.println(Gafa.IVA);
System.out.println("Todos los productos vendidos tiene un costo de envio de : ");
System.out.println(Gafa.ENVIO);
}

public double precioConIva(){
double total = this.precio+(this.precio*Gafa.IVA/100);
return total;
}

public double precioConIvaYEnvio(){
double total = this.precio+(this.precio*Gafa.IVA/100)+Gafa.ENVIO;
return total;
}
}
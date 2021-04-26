import java.util.Scanner;
public class Propiedad
{
   private String condicion;
   private int visitas= 0;
   Scanner scan = new Scanner(System.in);
   
   public Propiedad(String c){
        this.condicion = c;
    }
    
     public String getCondicion(){
        return this.condicion;
    }
    
     public int getVisitas(){
        return this.visitas;
    }
    
    public void setCondicion(){
System.out.println("Ingrese palabra");
String estado= scan.next();

while (estado.equals("nueva")){
this.condicion= estado;
while (estado.equals("usada")){
this.condicion= estado;
}
}

//this.condicion = i;
}

    public void aumentarVisitas(){
  if(condicion.equals("nueva")){
      this.visitas=visitas+2;
    }
  else{ this.visitas=visitas+1;
}
}
}


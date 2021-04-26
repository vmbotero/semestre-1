

public class Avion
{
private String nombre;
private int velocidad;
private int velocidadMaxima = 540; 
private int cohetes;  

public Avion (String n){
   this.nombre = n; 
   this.cohetes = 5; 
}

public Avion (String n, int v, int c){
   this.nombre = n; 
   this.velocidad = v;
   this.cohetes = c;
}

public String getNombre(){
return this.nombre;
}

public int getVelocidad(){
return this.velocidad;
}

public int getCohetes(){
return this.cohetes;
}

public void setDisparar(){
    if(cohetes>0){
    int resta = (cohetes-1);
    this.cohetes = resta;
}
}

public void setTripleDisparo(){
    if(cohetes>=3){
    int resta = (cohetes-3);
    this.cohetes = resta;
}
}

public void setdisminuirVelocidad(int v){
    int resta = (velocidad-v);
        if(resta>=0){
         this.velocidad = resta;
}
        else if(resta<0){
         this.velocidad = 0;   
}
}

public void setaumentarVelocidad(int v){
    int suma = (velocidad+v);
        if(suma<=velocidadMaxima){
         this.velocidad = suma;
}
        else if(suma>velocidadMaxima){
        this.velocidad = velocidadMaxima;
}
}
}
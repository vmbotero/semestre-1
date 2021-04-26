public class Personaje{
    private String nombre;
    private double ataque;
    private double salud;
    
    public Personaje(){
        this("Hada1",5,10);
}
    public Personaje(String n, double a, double s){
        this.nombre=n;
        this.ataque=a;
        this.salud=s;
}
    public String getNombre(){
        return this.nombre;
}
    public double getAtaque(){
        return this.ataque;
}
    public double getSalud(){
        return this.salud;
}
    public void setNombre(String n){
        this.nombre= n;
}
    public void setAtaque(double a){
        if(a >= 0){
        this.ataque= a;
}
}
    public void setSalud(double s){
        this.salud= s;
}

/*public static void pelea(Personaje p1, Personaje p2) { 

p2.setSalud(p2.getSalud() - p1.getAtaque()); 

if (p2.getSalud() <= 0) System.out.println("Personaje " + p2.getNombre() + " muerto"); 

} */

    public static void Pelea(Personaje p1, Personaje p2){
        double resta= (p2.getSalud() - p1.getAtaque());
        p2.salud=resta;
        if(p2.salud<=0){
            System.out.println("Personaje " + p2.getNombre() + " muerto");
        }
}

//el cual retorna un texto concatenado, con la información del nombre, ataque y salud del personaje actual. 
    public String toString (){
        String concat= new String("Personaje: "+ this.nombre + ", Ataque: "+ this.ataque + ", Estado de Salud: "+ this.salud);
        return concat;
}

}
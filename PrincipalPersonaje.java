import java.util.ArrayList;
public class PrincipalPersonaje{
    public static ArrayList<Personaje> personas = new ArrayList<Personaje>();
    public static void main(String[] args){
        Personaje p1 = new Personaje();
        Personaje p2 = new Personaje("Mago1",5,20);
        Personaje p3 = new Personaje("Humano1", 2, 10);
        
        PrincipalPersonaje.personas.add(p1);
        PrincipalPersonaje.personas.add(p2);
        PrincipalPersonaje.personas.add(p3);
        
        PrincipalPersonaje. mostrarPersonajes();
        
        //Ponga al personaje2 a pelear con el personaje3 
        Personaje.Pelea(p2,p3);
        PrincipalPersonaje. mostrarPersonajes();
        //Ponga al personaje1 a pelear con el personaje3. 
        Personaje.Pelea(p1,p3);
        PrincipalPersonaje. mostrarPersonajes();
        
    }
    //Invoque el método mostrar personajes y verifique que se imprime la información correctamente. 
    
    public static void mostrarPersonajes(){
        for(int i=0; i<3; i++){
        System.out.println(PrincipalPersonaje.personas.get(i).toString());
        } 
    }  
    
}    
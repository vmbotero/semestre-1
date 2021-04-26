import java.util.ArrayList;
import java.util.ArrayList;
public class PrincipalNave
{
public static ArrayList<Nave> naves = new ArrayList<Nave>();
public static void main(String[] args){
Nave n1 = new Nave();
Nave n2 = new Nave(1011,15,15);
Nave n3 = new Nave(1012,10,8);
naves.add(n1);
naves.add(n2);
naves.add(n3);
Nave.mostrarNavesVivas();
Nave.ataque(n1,n2);
Nave.ataque(n3,n1);
Nave.mostrarNavesVivas();
}
}
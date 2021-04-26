public class Naves
{
private int codigo;
private int salud;
private int ataque;
public Naves(){
this(1010,4,8);
}
public Naves(int c, int s, int a){
this.codigo = c;
this.salud = s;
this.ataque = a;
}
public int getCodigo(){
return this.codigo;
}
public void setCodigo(int c){
this.codigo = c;
}
public int getSalud(){
return this.salud;
}
public void setSalud(int s){
this.salud = s;
}
public int getAtaque(){
return this.ataque;
}
public void setAtaque(int a){
if(a>=0){
this.ataque = a;
}
}
public static void mostrarNavesVivas(){
for(int i=0; i<PrincipalNave.naves.size(); i++){
if(PrincipalNave.naves.get(i).getSalud()>0){
System.out.println(PrincipalNave.naves.get(i).toString());
}
}
}
public static void ataque(Nave n1, Nave n2){
n2.setSalud(n2.getSalud() - n1.getAtaque());
if(n2.getSalud()<=0){
System.out.println("Nave "+n2.getCodigo()+" destruida");
}
}
public String toString(){
return "Cod: "+this.getCodigo()+ " Salud"+ this.getSalud()+ " Ata:"+this.getAtaque();
}
}

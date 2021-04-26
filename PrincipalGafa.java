public class PrincipalGafa
{
public static void main(String[] args) {
Gafa g1 = new Gafa("Gafota",1000);
System.out.println(g1.toString());
System.out.println(g1);
}


/*
public class PrincipalGafa
{
public static void main(String[] args) {
Gafa.imprimirDatosGenerales();
}
}
*/
public String toString(){
return "( "+this.n+" - "+this.p+" )";
}
}

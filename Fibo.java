public class Fibo
{
public static void main(String[] args){
System.out.println(Fibo.fib(3));
}



public static int fib(int n) {
int previo1, previo2, respuesta;
if (n > 1) {
previo1 = fib(n-1);
previo2 = fib(n-2);
respuesta = previo1 + previo2;
}
else{
respuesta = n;
}
return respuesta;
}
}
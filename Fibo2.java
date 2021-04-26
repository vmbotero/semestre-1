public class Fibo2
{
public static void main(String[] args){
//System.out.println(Fibo.fib(3));
System.out.println(Fibo2.fibonacciIterativo(3));
}

public static int fibonacciIterativo(int n) {
if(n <= 1) {
return n;
}
int previo1 = 1;
int previo2 = 1;



for(int i=2; i<n; i++) {
int temp = previo1;
previo1 = previo1 + previo2;
previo2 = temp;
}
return previo1;
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
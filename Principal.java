import java.util.Scanner;
public class Principal {
  public static void main(String[] args) {   
    mostrarMenu();
  }
  public static void mostrarMenu(){
    Scanner scan = new Scanner(System.in);
    int control = 0;
    while(control < 1) {
       System.out.print("Ingrese un numero");
       int numero = scan.nextInt();
      if (numero == 0){
         control = 1;
      }else if (numero == 1){
         if (Vehiculo.posAñadir <= Vehiculo.tamaño){
           System.out.print("Ingrese el Modelo de Vehiculo");
           int modelo = scan.nextInt();

           System.out.print("Ingrese la Marca del Vehiculo");
           String marca = scan.next();

           System.out.print("Ingrese el Valor Comercial del Vehiculo");
           double valorComercial = scan.nextDouble();

           System.out.print("Ingrese el Color del Vehiculo");
           String color = scan.next();
           Vehiculo vehiculo = new Vehiculo(modelo, marca, valorComercial, color);
         }else if (Vehiculo.posAñadir == Vehiculo.tamaño){
           System.out.print("Error base de datos llena");
         }
      }else if (numero == 2){
         System.out.println(Vehiculo.vehiculos.toStringVehiculos());

      }else if (numero == 3){         
          System.out.print("La cantidad de Vehiculos creados son:" + Vehiculo.posAñadir); 

      }else if (numero == 4){
              System.out.println(Vehiculo.toStringVehiculosVerdes());

      }else if (numero == 5){
        if (Sensor.posAñadir <= Sensor.tamaño){
           System.out.print("Ingrese el Tipo de Sensor");
           String tipo = scan.next();

           System.out.print("Ingrese la Valor del Sensor");
           double valor = scan.nextDouble();

           Sensor sensor = new Sensor(tipo, valor);
        }else if (Sensor.posAñadir == Sensor.tamaño){
           System.out.print("Error base de datos llena");

      }else if (numero == 6){
         System.out.println(Sensor.toStringSensores());
        
      }else if (numero == 7){
         System.out.print("La cantidad de Sensores creados son:" + Sensor.posAñadir);

      }else if (numero == 8){
         System.out.print(Sensor.toStringSensoresTemperatura(Sensor.sensores)); 

      }else if (numero == 666){
        System.out.print(Sensor.toStringSensoresTemperaturaOrdenados());         
       }

  }
}
}
}
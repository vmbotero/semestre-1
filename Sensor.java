public class Sensor{

  private static String tipo;
  private static double valor;
  public static int tamaño = 8;
  public static int posAñadir = 0; 
  public static String imp; 
  public static Sensor[] sensores = new Sensor[8];

  public Sensor(){      
    } 

  public Sensor(String t, double v){
      this.tipo = t;
      this.valor = v;
    }

  public String getTipo(){
      return this.tipo;
    }

  public void setTipo(String t){
      this.tipo = t;
    }

  public double getValor(){
      return this.valor;
    }

  public void setValor(double v){
      this.valor = v;
    }

  public String toString (){
      return "Tipo: " + this.getTipo() + "Valor: " + this.getValor();
    }
    
  public String toStringSensores(){
      for(int i=0; i<Sensor.sensores.length; i++){
        imp = ("Sensor: " + i +sensores[i].toString());
      } return imp;
      }

  public int CantidadSensores(){
      return posAñadir;
    }

  public String toStringSensoresTemperatura(Sensor[] Arr){
    for(int i=0; i < Arr.length; i++){
        if(Principal.Arr[i].getTipo.equals("temperatura")){
      }        
    }
  }

  public String toStringSensoresTemperaturaOrdenados(){
    
   }
}
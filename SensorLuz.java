public class SensorLuz
{
private int intensidadMin;
private int intensidadMax;
private int intensidad;
public SensorLuz (int min, int max){
this.intensidad = min;
this.intensidadMin = min;
this.intensidadMax = max;

}

public int getIntensidad(){
return this.intensidad;
}

public void setIntensidad(int i){
if ((i <= intensidadMax) && (i >= intensidadMin)){
this.intensidad = i;
}
}

public int duplicarIntensidad(){
if (this.intensidad*2 <= this.intensidadMax){
this.intensidad = 2*this.intensidad;
}

return this.intensidad;
}
}
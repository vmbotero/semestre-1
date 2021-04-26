public class Ordenamiento{
    public static void main(String[] args){
int[] arr_edades = {50,40,30,10,20};
int n = arr_edades.length;
int pos_menor, temp;
for (int i = 0; i < n - 1; i++) {
pos_menor = i;
for (int j = i + 1; j < n; j++) {
if (arr_edades[j] < arr_edades[pos_menor]){
pos_menor = j;
}
}
temp = arr_edades[i];
arr_edades[i] = arr_edades[pos_menor];
arr_edades[pos_menor] = temp;
}
for(int i=0; i<n; i++){
System.out.println(arr_edades[i]);
}
}
}


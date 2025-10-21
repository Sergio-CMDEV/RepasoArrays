/* Calcula la suma de todos los elementos de un array de enteros. */

public class a4ArraySuma {
    public static void main(String[] args) {
        int[] n1 = {5, 5, 7, 3, 1};
        int suma = 0;

        for (int i = 0; i < n1.length; i++) {
            suma = suma + n1[i];
        }
    System.out.print(suma);
    }
}
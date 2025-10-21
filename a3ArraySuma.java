/* Calcula la suma de todos los elementos de un array de enteros. */

public class a3ArraySuma {
    public static void main(String[] args) {
        int[] n1 = {5, 5, 7, 3, 1};

        for (int i = 0; i < n1.length; i++) {
            n1[i] = n1.length + (n1.length + 1);
            System.out.print("'"+n1[i]+"' ");
        }
    }
}
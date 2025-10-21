/* Encuentra el número mayor y el menor en un array. */

public class a5ArrayMayorMenor {
    public static void main (String [] args) {
        int[] n1 = {5, 10, 20, 54, 3};

        int mayor = n1[0];
        int menor = n1[0];
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] > mayor) {
                mayor = n1[i];
            }
            if (n1[i] < menor) {
                menor = n1[i];
            }
        }
    System.out.println(mayor + " " + menor);
    }
}

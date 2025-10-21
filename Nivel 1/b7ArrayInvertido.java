/* Invierte el contenido de un array (sin usar `Collections.reverse()`). */

public class b7ArrayInvertido {
    public static void main(String[] args) {
        int n1[] = {1, 9, 30, 14, 18, 7, 0};

        int temp = 0;
        for (int i = 0; i < n1.length / 2; i++) {
            int j = n1.length - 1 - i;
            temp = n1[i];
            n1[i] = n1[j];
            n1[j] = temp;
        }
        for (int i = 0; i < n1.length; i++) {
        System.out.print(n1[i] + " ");
        }
    }
}

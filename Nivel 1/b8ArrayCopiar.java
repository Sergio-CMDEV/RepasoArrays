/* Copia los valores de un array a otro sin usar `clone()`. */
public class b8ArrayCopiar {
    public static void main(String[] args) {
        int n1[] = {6, 7, 8, 9, 10};
        int n2[] = new int[n1.length];

        if (n1.length > n2.length) {
            
        }
        for (int i = 0; i < n1.length; i++) {
            n2[i] = n1[i];
            System.out.print(n2[i] + " ");
        }
    }
}


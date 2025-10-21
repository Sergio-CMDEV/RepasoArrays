/* Cuenta cuántos valores mayores que 50 hay en un array de números aleatorios. */

public class b9ArrayContar50 {
    public static void main(String[] args) {
        int n1[] = new int[50];
        int contador = 0;

        for (int i = 0; i < n1.length; i++) {
            int random = (int)(Math.random() * 101);
            n1[i] = random;
            if (n1[i] > 50) {
                contador++;
            }
        }
        System.out.println("Cantidad de números mayores que 50: " + contador);
    }
}

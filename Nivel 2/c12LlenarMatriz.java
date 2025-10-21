/* Llena una matriz 3x3 con los números del 1 al 9. */

public class c12LlenarMatriz {
    public static void main(String[] args) {
        int n1[][] = new int[3][3];
        int contador = 1;

        for (int row = 0; row < n1.length; row++) {
            System.out.println("");
            for (int col = 0; col < n1.length; col++) {
                n1[row][col] = contador;
                contador++;
                System.out.print(n1[row][col] + " ");
            }
        }
    }
}

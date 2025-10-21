/* Crea una matriz 3x3 y muestra todos sus valores. */

public class c11Matriz {
    public static void main(String[] args) {
        int n1[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        for (int row = 0; row < n1.length; row++) {
            System.out.println();
            for (int col = 0; col < n1[row].length; col++) {
                System.out.print(n1[row][col] + " ");
            }
        }
    }
}
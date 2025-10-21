/* Rota una matriz 3x3 en sentido horario. */

public class c14RotarMatriz {
    public static void main(String[] args) {
        int n1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int temp[][] = new int[n1.length][n1.length];

        for (int row = 0; row < n1.length; row++) {
            for (int col = 0; col < n1.length; col++) {
                temp[col][n1.length - 1 - row] = n1[row][col];   
            }
        }
     
        for (int row = 0; row < n1.length; row++) {
            System.out.println();
            for (int col = 0; col < n1[row].length; col++) {
                System.out.print(temp[row][col] + " ");
            }
        }
    }
}

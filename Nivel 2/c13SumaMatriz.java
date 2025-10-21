/* Calcula la suma de cada fila y columna en una matriz. */

public class c13SumaMatriz {
    public static void main(String[] args) {
        int n1[][] = {{50, 40, 23}, {12, 54, 90}, {1, 7, 12}};

        int suma = 0;
        for (int row = 0; row < n1.length; row++) {
            for (int col = 0; col < n1.length; col++) {
                suma = suma + n1[row][col];
            }
        }
        System.out.println(suma);
    }
}
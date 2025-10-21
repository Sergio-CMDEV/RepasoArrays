/* Busca un número en una matriz y muestra su posición (fila, columna). */
import java.util.Scanner;

public class c15BuscarMatriz {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int n1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Introduce el valor a buscar (1 al 9)");
        int n2 = leerDatos.nextInt();
        
        for (int row = 0; row < n1.length; row++) {
            for (int col = 0; col < n1[row].length; col++) {
                if (n2 == n1[row][col]) {
                    System.out.println("Número encontrado en fila " + (row + 1) + ", columna " + (col + 1));
                }
            }
        }
    }
}

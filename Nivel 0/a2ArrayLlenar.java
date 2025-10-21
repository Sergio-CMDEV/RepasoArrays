/* Llena un array de 10 posiciones con los números del 1 al 10 usando un bucle for */
import java.util.Scanner;

public class a2ArrayLlenar {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] n1 = new int[10];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = i + 1;
            System.out.print("'"+n1[i]+"' ");
        }
    }
}
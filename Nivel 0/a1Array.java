/* Declara un array de 5 enteros y muestra sus valores por consola. */

public class a1Array {
    public static void main(String[] args) {
        int[] array = new int[5]; 
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
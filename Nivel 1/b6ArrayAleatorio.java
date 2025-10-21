/* Crea un array de 10 enteros aleatorios (0–99) y muestra solo los pares */

public class b6ArrayAleatorio {
    public static void main(String[] args) {
        int[] array = new int[10]; 

        for (int i = 0; i < 10; i++) {
            int randomNum = (int)(Math.random() * 100);
            array[i] = randomNum;
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}

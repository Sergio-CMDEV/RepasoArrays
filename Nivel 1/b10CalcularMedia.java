/* Calcula la media de los valores de un array. */
public class b10CalcularMedia {
    public static void main(String[] args) {
        int n1[] = {1, 20, 90, 43, 32, 76, 98, 120};
        int suma = 0;

        for (int i = 0; i < n1.length; i++) {
        suma = suma + n1[i];
        }
        int resultado = suma / n1.length;
        System.out.println(resultado);
    }
}

/* Crea un array de nombres (String) e imprime el primero y el último */

public class a3ArrayString {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Marta", "Carlos", "Sofía"};

        System.out.println("Primero: " + nombres[0]);
        System.out.println("Último: " + nombres[nombres.length - 1]);
    }
}

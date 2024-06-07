import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Crea una función que dibuje una escalera según su número de escalones");
        /* - Si el número es positivo, será ascendente de izquiera a derecha.
           - Si el número es negativo, será descendente de izquiera a derecha.
           - Si el número es cero, se dibujarán dos guiones bajos (__). */
        System.out.println("Please read a number: ");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        if (n > 0) {
            for (int i = n; i > 0; i--) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        } else if (n < 0) {
            for (int i = 1; i <= -n; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("|_");
            }
        } else {
            System.out.println("__");
        }
    }
}
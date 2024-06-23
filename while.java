import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        while (numero <= 5) {
            System.out.println("Número: " + numero);
            numero++;
        }

        scanner.close();
    }
}
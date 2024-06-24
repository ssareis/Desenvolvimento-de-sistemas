import java.util.Scanner;

public class laços10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1 e 10: ");
        int numero = scanner.nextInt();

        while (numero < 1 || numero > 10) {
            System.out.println("Número fora do intervalo permitido (1 a 10). Tente novamente.");
            System.out.print("Digite um número inteiro entre 1 e 10: ");
            numero = scanner.nextInt();
        }

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
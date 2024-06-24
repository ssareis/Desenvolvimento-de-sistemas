import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int numero;
        int contador = 0;

        while (contador < 10) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            contador++;
        }

        System.out.println("O maior número digitado é: " + maior);

        scanner.close();
    }
}
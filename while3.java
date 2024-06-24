import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        System.out.println("Números pares até " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nNúmeros ímpares até " + n + ":");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
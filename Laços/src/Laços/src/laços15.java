import java.util.Scanner;

public class laços15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para a série de Fibonacci: ");
        int n = scanner.nextInt();

        int a = 1, b = 1;
        System.out.print("Série de Fibonacci até o " + n + "º termo: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int soma = a + b;
            a = b;
            b = soma;
        }

        scanner.close();
    }
}
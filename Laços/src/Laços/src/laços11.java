import java.util.Scanner;

public class laços11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite um número maior que zero: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
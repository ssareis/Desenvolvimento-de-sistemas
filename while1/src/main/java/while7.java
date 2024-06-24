import java.util.Scanner;

public class while7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int tamanho = scanner.nextInt();

        if (tamanho < 1 || tamanho > 20) {
            System.out.println("Tamanho inválido. Digite um valor entre 1 e 20.");
        } else {
            for (int i = 1; i <= tamanho; i++) {
                for (int j = 1; j <= tamanho; j++) {
                    if (i == 1 || i == tamanho || j == 1 || j == tamanho) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
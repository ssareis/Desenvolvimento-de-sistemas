import java.util.Scanner;

public class laços3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char novoCalculo;

        do {
            // Leitura da primeira nota
            System.out.print("Digite a nota da 1ª avaliação (0 a 10): ");
            double nota1 = scanner.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota inválida. Digite novamente (0 a 10): ");
                nota1 = scanner.nextDouble();
            }

            // Leitura da segunda nota
            System.out.print("Digite a nota da 2ª avaliação (0 a 10): ");
            double nota2 = scanner.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota inválida. Digite novamente (0 a 10): ");
                nota2 = scanner.nextDouble();
            }

            // Calcula a média
            double media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);

            // Pergunta se deseja fazer novo cálculo
            System.out.print("NOVO CÁLCULO (S/N)? ");
            novoCalculo = scanner.next().charAt(0);
        } while (novoCalculo == 'S' || novoCalculo == 's');

        scanner.close();
    }
}
import java.util.Scanner;

public class Laços {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro valor (A): ");
            double a = scanner.nextDouble();
            
            System.out.print("Digite o segundo valor (B): ");
            double b = scanner.nextDouble();
            
            // Verifica se B é zero e solicita novo valor
            while (b == 0) {
                System.out.println("VALOR INVÁLIDO: B não pode ser zero.");
                System.out.print("Digite um novo valor para B: ");
                b = scanner.nextDouble();
            }
            
            // Realiza a divisão se B for diferente de zero
            double resultado = a / b;
            System.out.println("Resultado da divisão de A por B: " + resultado);
        }
    }
}
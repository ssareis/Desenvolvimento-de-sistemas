import java.util.Scanner;

public class switchcase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença entre os números");
        System.out.println("3 - Produto entre os números digitados");
        System.out.println("4 - Divisão do primeiro pelo segundo");
        System.out.print("Digite sua escolha: ");
        int escolha = scanner.nextInt();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (escolha) {
            case 1:
                resultado = (num1 + num2) / 2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                operacaoValida = false;
                break;
        }

        if (operacaoValida) {
            System.out.println("Resultado da operação: " + resultado);
        }

        scanner.close();
    }
}
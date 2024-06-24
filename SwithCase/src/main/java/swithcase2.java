import java.util.Scanner;

public class swithcase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        String mensagem;

        if (media >= 0.0 && media <= 4.0) {
            mensagem = "Reprovado";
        } else if (media > 4.0 && media <= 7.0) {
            mensagem = "Exame";
        } else if (media > 7.0 && media <= 10.0) {
            mensagem = "Aprovado";
        } else {
            mensagem = "Média inválida";
        }

        System.out.println("Média: " + media);
        System.out.println("Resultado: " + mensagem);

        scanner.close();
    }
}
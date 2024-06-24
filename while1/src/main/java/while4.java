import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos na turma? ");
        int quantidadeAlunos = scanner.nextInt();

        int soma = 0;
        int contador = 0;

        while (contador < quantidadeAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            int nota = scanner.nextInt();
            soma += nota;
            contador++;
        }

        double media = (double) soma / quantidadeAlunos;
        System.out.println("Média da turma: " + media);

        scanner.close();
    }
}

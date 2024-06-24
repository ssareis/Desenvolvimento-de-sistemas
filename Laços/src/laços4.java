import java.util.Scanner;

public class laços4 {
    public static void main(String[] args) {
        double populacaoA = 80000;
        double crescimentoA = 0.03;
        double populacaoB = 200000;
        double crescimentoB = 0.015;
        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA *= (1 + crescimentoA);
            populacaoB *= (1 + crescimentoB);
            anos++;
        }

        System.out.println("Número de anos necessários para A ultrapassar ou igualar B: " + anos);
    }
}

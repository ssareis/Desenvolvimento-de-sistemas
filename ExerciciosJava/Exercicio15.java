package Exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    
     public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("Escreva o número de um município: ");
        double m = teclado.nextFloat();
        System.out.println("Escreva o número de votos brancos: ");
        double b = teclado.nextFloat();
        System.out.println("Escreva o número de votos nulos:  ");
        double n = teclado.nextFloat();
        System.out.println("Escreva o número de votos válidos:  ");
        double v = teclado.nextFloat();
        
        double percentualBrancos = (b * 100.0) / m;
        double percentualNulos = (n * 100.0) / m;
        double percentualValidos = (v * 100.0) / m;

        // Exibindo os resultados
        System.out.println("\nResultados:");
        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
    }
    
}
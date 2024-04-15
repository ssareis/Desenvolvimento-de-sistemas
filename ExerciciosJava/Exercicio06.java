package Exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {

        int numero1 = 6;
        int numero2 = 20;

        System.out.println("Antes da troca:");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        int temporario = numero1;
        numero1 = numero2;
        numero2 = temporario;
        System.out.println("\nDepois da troca:");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
    }
}
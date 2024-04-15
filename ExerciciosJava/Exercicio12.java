package Exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    
     public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número:  ");
        float n = teclado.nextFloat();

        
        float calculo = n - 1;
        
        System.out.println("O antecessor dele é:  " + calculo);
    }
    
}
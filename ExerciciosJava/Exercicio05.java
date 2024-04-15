package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    
     public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        System.out.println("Qual é a medida em cm da altura do retângulo?  ");
        float h = teclado.nextFloat();
        System.out.println("Qual é a medida da base do retângulo?  ");
        float b = teclado.nextFloat();
        
        float calculo = b * h;
        
        System.out.println("A área do retângulo é: " + calculo);
    }
    
}
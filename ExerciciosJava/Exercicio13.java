package Exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    
     public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        System.out.println("Escreva sua idade em anos:  ");
        float a = teclado.nextFloat();
        System.out.println("Escreva sua idade em meses:  ");
        float m = teclado.nextFloat();
        System.out.println("Escreva sua idade em dias:  ");
        float d = teclado.nextFloat();
     
     
        float calculo = (a * 365) + (m * 30) + d;
        
        System.out.println("Sua idade em dias é:  " + calculo);
    }
    
}
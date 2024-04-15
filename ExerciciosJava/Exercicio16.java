package Exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    
     public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        System.out.println("Escreva seu salário mensal atual:  ");
        float m = teclado.nextFloat();
        System.out.println("Escreva a porcentagem de reajuste:  ");
        float r = teclado.nextFloat();
     
        float calculo = m * r;
        
        System.out.println("Seu novo salário será:  " + calculo);
    }
    
}
package Exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    
     public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        System.out.println("Escreva o custo de fábrica do carro:  ");
        double c = teclado.nextFloat();
        double percentualDistribuidor = 0.28; // 28%
        double percentualImpostos = 0.45; // 45%
        
        double d = c * percentualDistribuidor;
        double i = c * percentualImpostos;
        
        
     
        double calculo = c + d + i;
        
        System.out.println("Seu custo final é de:  " + calculo);
    }
    
}
package Exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        System.out.println("Qual é a distância da viagem em km?  ");
        float d = teclado.nextFloat();
        System.out.println("Qual é o valor do combustível em L?  ");
        float c = teclado.nextFloat();
        System.out.println("Quanto seu carro roda com 1L?  ");
        float r = teclado.nextFloat();
        
        float calculo = c / r * d;
        
        System.out.println("O custo da viagem é de: " + calculo);
    }
}
    


package Exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    
     public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("Escreva seu salário fixo:  ");
       double fixo = teclado.nextDouble();
       System.out.println("Escreva seu número de carros vendidos:  ");
       double carros = teclado.nextDouble();
       System.out.println("Escreva o valor total de suas vendas:  ");
       double vendas = teclado.nextDouble();
       System.out.println("Escreva o valor que você recebe por carro vendido:  ");
       double vendaporcarro = teclado.nextDouble();
       
       double calculo = fixo + vendaporcarro * carros + vendas * 0.05;
       

        System.out.println("Seu salário final é de:  " + calculo);
    }
    
}
package Exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    
     public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("Escreva seu salário fixo:  ");
       float fixo = teclado.nextFloat();
       System.out.println("Escreva seu número de carros vendidos:  ");
       float carros = teclado.nextFloat();
       System.out.println("Escreva o valor total de suas vendas:  ");
       float vendas = teclado.nextFloat();
       System.out.println("Escreva o valor que você recebe por carro vendido:  ");
       float vendaporcarro = teclado.nextFloat();
       
       float calculo = fixo + vendaporcarro * carros + vendas;

        System.out.println("Seu salário final é de:  " + calculo);
    }
    
}
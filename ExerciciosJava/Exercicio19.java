package Exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    
     public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("Escreva seu sal�rio fixo:  ");
       float fixo = teclado.nextFloat();
       System.out.println("Escreva seu n�mero de carros vendidos:  ");
       float carros = teclado.nextFloat();
       System.out.println("Escreva o valor total de suas vendas:  ");
       float vendas = teclado.nextFloat();
       System.out.println("Escreva o valor que voc� recebe por carro vendido:  ");
       float vendaporcarro = teclado.nextFloat();
       
       float calculo = fixo + vendaporcarro * carros + vendas;

        System.out.println("Seu sal�rio final � de:  " + calculo);
    }
    
}
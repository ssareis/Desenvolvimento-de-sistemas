package Exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    
     public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Escreva seu nome:  ");
       String nome = teclado.next();
       System.out.println("Escreva seu sexo (F para feminino ou M para masculino):  ");
       String sexo = teclado.next();
       System.out.println("Escreva sua altura:  ");
       double altura = teclado.nextDouble();
       
       double calculo;
       
       if (sexo.equals("F")) {
           calculo = 72.7 * altura - 58;
       } else if (sexo.equals("M")) {
           calculo = 62.1 * altura - 44.7;
       } else {
           System.out.println("Sexo inválido.");
           return;
       }

       System.out.println("Seu peso ideal é de:  " + calculo);
    }
}
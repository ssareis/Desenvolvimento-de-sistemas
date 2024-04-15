package exercicio03;

import java.util.Scanner;

class Exercicio03 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
         System.out.println("Escreva o nome do vendedor: ");
         String nome = teclado.nextLine ();
         System.out.println("Escreva o salário fixo do vendedor: ");
         float salario = teclado.nextFloat();
         System.out.println("Escreva o total de vendas efetuadas por ele no mês em dinheiro: ");
         float vendas = teclado.nextFloat();
         
         float calculo = salario + vendas*0,15;
         System.out.println("Seu nome é: "+nome+" ,seu salário fixo é: "+salario+" e seu salário final do mês é "+calculo);
    }
    
}

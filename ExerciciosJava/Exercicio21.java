package Exercicio21;

import java.util.Scanner;

public class Exercicio21 {
    
     public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o número de litros vendidos:");
        double litros = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Digite o tipo de combustível (A para álcool, G para gasolina):");
        String tipoCombustivel = teclado.nextLine();
        
        double valorTotal = 0;
        
        if (tipoCombustivel.equalsIgnoreCase("a") && litros<=20){
            valorTotal = litros * (2.90 - (2.90*0.03));
        } else if (tipoCombustivel.equalsIgnoreCase("a") && litros>20) {
            valorTotal = litros * (2.90 - (2.90*0.05));
        } else if (tipoCombustivel.equalsIgnoreCase("g") && litros<=20) {
           valorTotal = litros * (3.30 - (3.30*0.04));
        } else if (tipoCombustivel.equalsIgnoreCase("g") && litros>=20) {
          valorTotal = litros * (3.30 - (3.30*0.06));
         } else {
            System.out.println("Tipo de combustível inválido.");
        }
         
        System.out.printf("Valor a ser pago pelo cliente: R$ %.2f%n", valorTotal);
    }
}

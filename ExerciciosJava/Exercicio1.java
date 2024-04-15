/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

import java.util.Scanner;

public class Exercicio1 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número: ");
        float n = teclado.nextFloat();
         System.out.println("Digite outro número: ");
        float m = teclado.nextFloat();
        
        float calculo_soma = (n+m);
        float calculo_sub = (n-m) ;
        float calculo_multi = (n*m);
        float calculo_div = (n/m);
        
        System.out.println("Soma entre eles: "+calculo_soma+", subtração entre eles: "+calculo_sub+", multiplicação entre eles: "+calculo_multi+" e divisão entre eles: ."+calculo_div);
        
        }
    
}

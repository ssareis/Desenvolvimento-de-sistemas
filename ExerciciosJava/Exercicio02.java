package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        System.out.println("Qual foi a distância total percorrida pelo automóvel em km? ");
        float d = teclado.nextFloat();
        System.out.println("Qual o total de combustível gasto em litros? ");
        float c = teclado.nextFloat();
        
        float calculo = d/c;
        
        System.out.println("O consumo médio do automóvel é; "+calculo);
    }
    
}

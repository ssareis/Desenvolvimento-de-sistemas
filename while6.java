import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior1 = Integer.MIN_VALUE;
        int maior2 = Integer.MIN_VALUE;
        int numero;
        int contador = 0;

        while (contador < 10) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero > maior1) {
                maior2 = maior1;
                maior1 = numero;
            } else if (numero > maior2) {
                maior2 = numero;
            }

            contador++;
        }

        System.out.println("Os dois maiores números digitados são: " + maior1 + " e " + maior2);

        scanner.close();
    }
}
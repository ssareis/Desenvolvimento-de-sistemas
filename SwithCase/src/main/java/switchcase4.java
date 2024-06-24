import java.util.Scanner;

public class switchcase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cardápio:");
        System.out.println("Código\tProduto\t\tPreço Unitário (R$)");
        System.out.println("100\tCachorro quente\tR$ 1,70");
        System.out.println("101\tBauru Simples\tR$ 2,30");
        System.out.println("102\tBauru com ovo\tR$ 2,60");
        System.out.println("103\tHamburguer\tR$ 2,40");
        System.out.println("104\tCheeseburguer\tR$ 2,50");
        System.out.println("105\tRefrigerante\tR$ 1,00");

        System.out.print("Digite o código do item adquirido: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double precoUnitario = 0;

        switch (codigo) {
            case 100:
                precoUnitario = 1.70;
                break;
            case 101:
                precoUnitario = 2.30;
                break;
            case 102:
                precoUnitario = 2.60;
                break;
            case 103:
                precoUnitario = 2.40;
                break;
            case 104:
                precoUnitario = 2.50;
                break;
            case 105:
                precoUnitario = 1.00;
                break;
            default:
                System.out.println("Código inválido.");
                break;
        }

        double valorTotal = precoUnitario * quantidade;
        System.out.println("Valor a pagar: R$ " + valorTotal);

        scanner.close();
    }
}
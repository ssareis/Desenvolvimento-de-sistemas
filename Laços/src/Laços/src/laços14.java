public class laços14 {
    public static void main(String[] args) {
        int populacaoA = 80000;
        double taxaCrescimentoA = 0.03; // 3% ao ano
        int populacaoB = 200000;
        double taxaCrescimentoB = 0.015; // 1.5% ao ano
        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");
    }
}
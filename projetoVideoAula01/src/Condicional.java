public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String categoriaPlano = "Plus";

        if (anoDeLancamento >= 2024) {
            System.out.println("Lançamento!");
        } else {
            System.out.println("Filme lançado em: " + anoDeLancamento);
        }

        if (incluidoNoPlano || categoriaPlano.equals("Plus")) {
            System.out.println("Você pode assistir, o filme está incluso no seu plano: " + categoriaPlano);
        } else {
            System.out.println("Você não pode assistir, o filme não está incluso no seu plano: " + categoriaPlano);
        }
    }
}

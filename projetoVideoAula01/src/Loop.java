import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int numeroDeNotas = 3;

        for (int i = 0; i < numeroDeNotas; i++) {
            System.out.println("Diga sua avaliação para o filme [0 a 10] ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        String mediaFormatada = String.format("%.2f", mediaAvaliacao/numeroDeNotas);
        System.out.println("Média de avaliações foi: " + mediaFormatada);
    }
}

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou digite '-1' para Encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

        }
        if (nota < 0 && totalDeNotas <= 1) {
            System.out.println("Não há valores suficientes para calcular a média!");
        } else if (totalDeNotas > 1) {
            String mediaFormatada = String.format("%.2f", mediaAvaliacao/totalDeNotas);
            System.out.println("Média de avaliações foi: " + mediaFormatada);
        }
    }
}

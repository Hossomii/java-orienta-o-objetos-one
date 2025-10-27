import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        System.out.println("Digite quantos usuários desejam avaliar o filme: ");
        int numeroDeNotas = leitura.nextInt();
        int contador = 0;
        while (contador != numeroDeNotas) {
            System.out.println("Diga sua avaliação para o filme [0 a 10] ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            contador++;
        }
        String mediaFormatada = String.format("%.2f", mediaAvaliacao/numeroDeNotas);
        System.out.println("Média de avaliações foi: " + mediaFormatada);
    }
}

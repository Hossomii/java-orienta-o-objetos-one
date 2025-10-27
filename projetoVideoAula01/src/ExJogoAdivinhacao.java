import java.util.Scanner;
import java.util.Random;

public class ExJogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10);
        int numeroTentativas = 0;
        int maxTentativas = 5;
        int userTry = 0;

        while (userTry != randomNumber || numeroTentativas < maxTentativas) {
            System.out.print("Digite o número aleatório: ");
            userTry = scanner.nextInt();
            numeroTentativas++;

            if (maxTentativas == 0) {
                System.out.println("Game Over!");
                break;
            }

            if (userTry < randomNumber) {
                System.out.println("O número que digitou é menor que o número correto! Tente novamente.");
                System.out.println("Você ainda possuí: " + maxTentativas-- + " Tentatativas");
            } else if (userTry > randomNumber){
                System.out.println("O número que digitou é maior que o número correto! Tente novamente.");
                System.out.println("Você ainda possuí: " + maxTentativas-- + " Tentatativas");
            } else {
                System.out.println("""
                        Parabéns você acertou! 
                        Número de Tentativas: %d
                        Número Correto: %d
                        """.formatted(numeroTentativas, randomNumber));
                break;
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                String nome = "Nome da Silva";
                String tipoConta = "Corrente";
                double saldo = 1000.00;
                int escolha = 0;

                System.out.println("""
                ***********************
                Dados inicias do cliente:
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                """.formatted(nome, tipoConta, saldo));

                String menu = ("""
                Operações
                    
                1. Consultar saldo
                2. Receber valor
                3. Transferir valor
                4. Sair
                   
                """);

                Scanner scanner = new Scanner(System.in);

                while(escolha != 4) {
                    System.out.println(menu);
                    System.out.print("Digite a opção desejada: ");
                    escolha = scanner.nextInt();

                    switch (escolha) {
                        case 1:
                            System.out.printf("O saldo atual é: R$ %.2f\n", saldo);
                            break;
                        case 2:
                            System.out.print("Informe o valor a receber: ");
                            double valorRecebido = scanner.nextDouble();
                            if (valorRecebido > 0) {
                                saldo += valorRecebido;
                                System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                            } else {
                                System.out.println("Opção inválida. Tente novamente.");
                            }
                            break;
                        case 3:
                            System.out.print("Informe o valor que deseja transferir: ");
                            double valorTransferido = scanner.nextDouble();
                            if (saldo > 0 && saldo < valorTransferido) {
                                System.out.println("Não há saldo suficiente para fazer essa transferência.");
                            } else {
                                saldo -= valorTransferido;
                                System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                            }
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.\n");
                    }
                }
            }
        }
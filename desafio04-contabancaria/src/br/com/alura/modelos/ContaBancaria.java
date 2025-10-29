package br.com.alura.modelos;

public class ContaBancaria {
        protected double saldo;

        public void depositar(double valor) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " Realizado. Saldo atual: " + saldo);
        }

        public void sacar(double valor) {
            if (valor <= saldo && valor > 0) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " Realizado. Saldo atual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente. Saldo atual: " + saldo);
            }
        }

        public void consultarSaldo() {
            System.out.println("Saldo atual: " + saldo);
        }
}

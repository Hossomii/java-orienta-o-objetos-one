package br.com.alura.modelos;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 20.0;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de: " + tarifaMensal + " Cobrada. Saldo atual: " + saldo);
    }
}

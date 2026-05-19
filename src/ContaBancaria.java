// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;

    public ContaBancaria() {
    }

    public void depositar(double valor) {
        if (valor <= 0) return;
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) return;
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

    public void exibirExtrato() {
        System.out.println("====== Extrato ======");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("=====================");
    }
}

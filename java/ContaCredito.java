public class ContaCredito {
    private double saldo;

    public ContaCredito() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de crédito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void pagar(double valor) {
        if (valor > 0 && saldo >= valor) {
            double valorDescontado = valor;
            saldo -= valorDescontado;
            System.out.println("Pagamento de crédito de R$" + valorDescontado + " realizado com sucesso.");
            saldo += valorDescontado / 2; 
        } else {
            System.out.println("Saldo insuficiente para realizar o pagamento.");
        }
    }
}

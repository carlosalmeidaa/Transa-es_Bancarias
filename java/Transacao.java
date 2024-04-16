public class Transacao {
    public static void depositar(ContaDebito conta, double valor) {
        if (valor > 0) {
            conta.depositar(valor);
            System.out.println("Depósito de débito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public static void depositar(ContaCredito conta, double valor) {
        if (valor > 0) {
            conta.depositar(valor);
            System.out.println("Depósito de crédito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
}

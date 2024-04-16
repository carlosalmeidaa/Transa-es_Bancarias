import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaDebito contaDebito = new ContaDebito();
        ContaCredito contaCredito = new ContaCredito();

        System.out.println("Saldo inicial da conta de débito: R$" + contaDebito.getSaldo());
        System.out.println("Saldo inicial da conta de crédito: R$" + contaCredito.getSaldo());

        System.out.print("Informe o valor para depósito na conta de débito: ");
        double valorDepositoDebito = scanner.nextDouble();
        contaDebito.depositar(valorDepositoDebito);

        System.out.print("Informe o valor para depósito na conta de crédito: ");
        double valorDepositoCredito = scanner.nextDouble();
        contaCredito.depositar(valorDepositoCredito);

        System.out.print("Informe o valor para pagamento com a conta de débito: ");
        double valorPagamentoDebito = scanner.nextDouble();
        contaDebito.pagar(valorPagamentoDebito);

        System.out.print("Informe o valor para pagamento com a conta de crédito: ");
        double valorPagamentoCredito = scanner.nextDouble();
        contaCredito.pagar(valorPagamentoCredito);

        System.out.println("Saldo atual da conta de débito: R$" + contaDebito.getSaldo());
        System.out.println("Saldo atual da conta de crédito: R$" + contaCredito.getSaldo());

        scanner.close();
    }
}

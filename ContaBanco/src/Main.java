import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        BigDecimal saldo = scanner.nextBigDecimal();

        String mensagem = String.format("""
            Olá %s, obrigado por criar uma conta em nosso banco,
            sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.
            """, nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);

        scanner.close();
    }
}
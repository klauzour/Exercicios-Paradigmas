import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();
        ContaBancaria conta = new ContaBancaria(titular);

        while (true)
        {
            System.out.print("Você deseja sacar ou depositar? (digite 'sacar', 'depositar' ou 'sair'): ");
            String acao = scanner.nextLine().strip().toLowerCase();

            switch (acao)
            {
                case "sacar":
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSacar = scanner.nextDouble();
                    scanner.nextLine();  // Limpar o buffer do scanner
                    conta.sacar(valorSacar);
                    break;
                case "depositar":
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDepositar = scanner.nextDouble();
                    scanner.nextLine();  // Limpar o buffer do scanner
                    conta.depositar(valorDepositar);
                    break;
                case "sair":
                    System.out.println("Saindo...");
                    scanner.close(); // Fechar o scanner antes de sair
                    return; // Encerra o programa
                default:
                    System.out.println("Ação inválida. Tente novamente.");
                    break;
            }

            // Exibindo extrato final
            System.out.println("\nExtrato da Conta:");
            System.out.println(conta.exibirSaldo());
            scanner.close(); // Fechar o scanner
        }
    }
}
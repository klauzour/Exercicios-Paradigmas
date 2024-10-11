import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa("JPA HIPOTETICA");
        empresa.adicionarEmpregado(new Empregado("Gabriel Carvalho", "Desocupado", 0));

        while (true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Empregado");
            System.out.println("2. Listar Empregados");
            System.out.println("3. Calcular Folha de Pagamento");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            String escolha = scanner.nextLine();

            switch (escolha)
            {
                case "1":
                    System.out.print("Digite o nome do empregado: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o cargo do empregado: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Digite o salário do empregado: ");
                    double salario = Double.parseDouble(scanner.nextLine());
                    Empregado empregado = new Empregado(nome, cargo, salario);
                    empresa.adicionarEmpregado(empregado);
                    System.out.printf("Empregado '%s' adicionado.%n", nome);
                    break;

                case "2":
                    System.out.printf("\nEmpregados da empresa '%s':%n", empresa);
                    empresa.listarEmpregados();
                    break;

                case "3":
                    double totalFolha = empresa.calcularFolhaPagamento();
                    System.out.printf("Total da folha de pagamento: R$ %.2f%n", totalFolha);
                    break;

                case "4":
                    System.out.println("FINALIZANDO...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}

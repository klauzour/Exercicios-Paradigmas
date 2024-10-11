import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new FuncionarioHorista("Milena Sicrana", 160, 25));
        funcionarios.add(new FuncionarioAssalariado("Fulano Beltrano", 10000));
        funcionarios.add(new FuncionarioHorista("Ricardo Curioso", 180, 5));
        funcionarios.add(new FuncionarioAssalariado("Diana Moon", 25000));

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Funcionário Horista");
            System.out.println("2. Adicionar Funcionário Assalariado");
            System.out.println("3. Listar Funcionários e Salários");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção (1/2/3/4): ");
            String escolha = scanner.nextLine();

            switch (escolha)
            {
                case "1":
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeHorista = scanner.nextLine();
                    System.out.print("Digite o número de horas trabalhadas: ");
                    double horasTrabalhadas = Double.parseDouble(scanner.nextLine());
                    System.out.print("Digite o valor por hora: ");
                    double valorHora = Double.parseDouble(scanner.nextLine());
                    FuncionarioHorista funcionarioHorista = new FuncionarioHorista(nomeHorista, horasTrabalhadas, valorHora);
                    funcionarios.add(funcionarioHorista);
                    System.out.println(STR."Funcionário \{nomeHorista} adicionado como horista.");
                    break;

                case "2":
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeAssalariado = scanner.nextLine();
                    System.out.print("Digite o salário mensal: ");
                    double salarioMensal = Double.parseDouble(scanner.nextLine());
                    FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado(nomeAssalariado, salarioMensal);
                    funcionarios.add(funcionarioAssalariado);
                    System.out.println(STR."Funcionário \{nomeAssalariado} adicionado como assalariado.");
                    break;

                case "3":
                    System.out.println("\nFuncionários cadastrados:");
                    for (Funcionario funcionario : funcionarios) {
                        System.out.printf("%s: Salário = R$ %.2f%n", funcionario.toString(), funcionario.calcularSalario());
                    }
                    break;

                case "4":
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
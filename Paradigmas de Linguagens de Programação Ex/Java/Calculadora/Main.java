import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        label:
        while (true)
        {
            System.out.println("\nCalculadora");
            System.out.println("1. Somar dois números");
            System.out.println("2. Somar três números");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção (1/2/3): ");
            String escolha = scanner.nextLine();

            switch (escolha)
            {
                case "1":
                    try
                    {
                        System.out.print("Digite o primeiro número: ");
                        double num1 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Digite o segundo número: ");
                        double num2 = Double.parseDouble(scanner.nextLine());
                        double resultado = calc.somar(num1, num2);
                        System.out.printf("Soma de %.2f e %.2f: %.2f%n", num1, num2, resultado);
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Entrada inválida. Por favor, insira números válidos.");
                    }

                    break;
                case "2":
                    try
                    {
                        System.out.print("Digite o primeiro número: ");
                        double num1 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Digite o segundo número: ");
                        double num2 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Digite o terceiro número: ");
                        double num3 = Double.parseDouble(scanner.nextLine());
                        double resultado = calc.somar(num1, num2, num3);
                        System.out.printf("Soma de %.2f, %.2f e %.2f: %.2f%n", num1, num2, num3, resultado);
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Entrada inválida. Por favor, insira números válidos.");
                    }

                    break;
                case "3":
                    System.out.println("Saindo...");
                    break label;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}

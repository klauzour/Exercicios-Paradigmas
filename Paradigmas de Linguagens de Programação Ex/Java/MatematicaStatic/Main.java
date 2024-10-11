import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.print("Digite um número para calcular o fatorial: ");
            int numero = scanner.nextInt();
            BigInteger fatorial = Matematica.fatorial(numero);
            System.out.println(STR."O fatorial de \{numero} é \{fatorial}.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }
    }
}
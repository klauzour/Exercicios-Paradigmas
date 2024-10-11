import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Carro> garagem = new ArrayList<>();
        garagem.add(new Carro("Hyundai", "HB20", 2024));
        garagem.add(new Carro("Fiat", "Mobi", 2018));
        garagem.add(new Carro("Tesla", "Cybertruck", 2023));

        System.out.println("Nós temos em nossas garagens:");
        for (int i = 0; i < garagem.size(); i++) {
            System.out.println((i + 1) + ": " + garagem.get(i).detalhes());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do carro que você deseja escolher: ");
        int escolha = scanner.nextInt() - 1;

        if (escolha >= 0 && escolha < garagem.size())
        {
            Carro carroSelecionado = garagem.get(escolha);
            System.out.println("Você escolheu: " + carroSelecionado.detalhes());

            while (true)
            {
                System.out.print("Digite um comando (acelerar, frear, velocidade, sair): ");
                String comando = scanner.next().trim().toLowerCase();

                switch (comando)
                {
                    case "acelerar":
                        System.out.print("Quanto deseja acelerar? (em km/h): ");
                        int aumento = scanner.nextInt();
                        carroSelecionado.acelerar(aumento);
                        break;

                    case "frear":
                        System.out.print("Quanto deseja frear? (em km/h): ");
                        int declinio = scanner.nextInt();
                        carroSelecionado.frear(declinio);
                        break;

                    case "velocidade":
                        carroSelecionado.exibirVelocidade();
                        break;

                    case "sair":
                        System.out.println("Saindo...");
                        scanner.close();
                        return;  // Exit the program

                    default:
                        System.out.println("Comando inválido. Tente novamente.");
                        break;
                }
            }
        }
        else
        {
            System.out.println("Escolha inválida. Encerrando o programa.");
        }
    }
}
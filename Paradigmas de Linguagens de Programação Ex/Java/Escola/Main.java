import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Escola> escolas = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();

        // Pré-cadastrando escolas e professores
        escolas.add(new Escola("IRB"));
        escolas.add(new Escola("IFPB"));
        professores.add(new Professor("Daniel Matos"));
        professores.add(new Professor("Fulano da Silva"));

        // Associando professores a escolas
        professores.get(1).lecionar(escolas.get(0));
        professores.get(1).lecionar(escolas.get(1));
        professores.get(0).lecionar(escolas.get(1));

        while (true)
        {
            System.out.println("\nMenu:");
            System.out.println("(1) Exibir informações");
            System.out.println("(2) Adicionar escola");
            System.out.println("(3) Adicionar professor");
            System.out.println("(4) Associar professor a escola");
            System.out.println("(5) SAIR");
            System.out.print("Selecione uma opção: ");
            String escolha = scanner.nextLine();

            switch (escolha)
            {
                case "1":
                    for (Escola escola : escolas)
                    {
                        System.out.printf("\nDocentes do %s: %s%n", escola, escola.getProfessores());
                    }
                    for (Professor professor : professores)
                    {
                        System.out.printf("Onde %s leciona: %s%n", professor, professor.getEscolas());
                    }
                    break;

                case "2":
                    System.out.print("Digite aqui o nome da escola: ");
                    String nomeEscola = scanner.nextLine();
                    Escola escola = new Escola(nomeEscola);
                    escolas.add(escola);
                    System.out.printf("Escola '%s' adicionada%n", nomeEscola);
                    break;

                case "3":
                    System.out.print("Digite aqui o nome do docente: ");
                    String nomeProfessor = scanner.nextLine();
                    Professor professor = new Professor(nomeProfessor);
                    professores.add(professor);
                    System.out.printf("Docente '%s' adicionado%n", nomeProfessor);
                    break;

                case "4":
                    System.out.print("Digite o nome do docente: ");
                    String nomeDocente = scanner.nextLine();
                    System.out.print("Digite o nome da escola: ");
                    String nomeEscolaAssoc = scanner.nextLine();

                    Professor prof = professores.stream()
                            .filter(p -> p.toString().equals(nomeDocente))
                            .findFirst().orElse(null);

                    Escola esc = escolas.stream()
                            .filter(e -> e.toString().equals(nomeEscolaAssoc))
                            .findFirst().orElse(null);

                    if (prof != null && esc != null)
                    {
                        prof.lecionar(esc);
                        System.out.printf("Professor '%s' associado a escola '%s'.%n", nomeDocente, nomeEscolaAssoc);
                    }
                    else
                    {
                        System.out.println("Professor ou escola não encontrados.");
                    }
                    break;

                case "5":
                    System.out.println("FINALIZANDO...");
                    scanner.close();
                    return;

                default:
                    System.out.println("ESCOLHA INVÁLIDA, tente novamente.");
            }
        }
    }
}

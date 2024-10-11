import java.util.ArrayList;
import java.util.List;

class Empresa
{
    private final String nome;
    private final List<Empregado> empregados;

    public Empresa(String nome)
    {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado)
    {
        empregados.add(empregado);
    }

    public void listarEmpregados()
    {
        if (empregados.isEmpty())
        {
            System.out.println("Nenhum empregado cadastrado.");
        }
        else
        {
            for (Empregado empregado : empregados)
            {
                System.out.println(empregado);
            }
        }
    }

    public double calcularFolhaPagamento()
    {
        double total = 0;
        for (Empregado empregado : empregados)
        {
            total += empregado.getSalario();
        }
        return total;
    }

    @Override
    public String toString()
    {
        return nome;
    }
}


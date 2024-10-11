import java.util.ArrayList;
import java.util.List;
class Escola
{
    private final String nome;
    private final List<Professor> professores;

    public Escola(String nome)
    {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void contratar(Professor professor)
    {
        if (!professores.contains(professor))
        {
            professores.add(professor);
            professor.lecionar(this);
        }
    }

    @Override
    public String toString()
    {
        return nome;
    }

    public List<Professor> getProfessores()
    {
        return professores;
    }
}
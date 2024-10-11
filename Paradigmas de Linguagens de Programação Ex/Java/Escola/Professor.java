import java.util.ArrayList;
import java.util.List;
class Professor
{
    private final String nome;
    private final List<Escola> escolas;

    public Professor(String nome)
    {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public void lecionar(Escola escola)
    {
        if (!escolas.contains(escola))
        {
            escolas.add(escola);
            escola.contratar(this);
        }
    }

    @Override
    public String toString()
    {
        return nome;
    }

    public List<Escola> getEscolas()
    {
        return escolas;
    }
}

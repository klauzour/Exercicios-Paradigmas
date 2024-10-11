class FuncionarioAssalariado extends Funcionario
{
    private final String nome;
    private final double salarioMensal;

    public FuncionarioAssalariado(String nome, double salarioMensal)
    {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario()
    {
        return salarioMensal;
    }

    @Override
    public String toString()
    {
        return STR."\{nome} (Assalariado)";
    }
}

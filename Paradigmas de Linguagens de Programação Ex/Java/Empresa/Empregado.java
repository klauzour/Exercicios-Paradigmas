class Empregado
{
    private final String nome;
    private final String cargo;
    private final double salario;

    public Empregado(String nome, String cargo, double salario)
    {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString()
    {
        return String.format("%s - %s - R$ %.2f", nome, cargo, salario);
    }

    public double getSalario()
    {
        return salario;
    }
}

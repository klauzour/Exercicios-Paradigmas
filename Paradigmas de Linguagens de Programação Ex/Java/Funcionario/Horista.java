class FuncionarioHorista extends Funcionario
{
    private final String nome;
    private final double horasTrabalhadas;
    private final double valorHora;

    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorHora)
    {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario()
    {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public String toString()
    {
        return STR."\{nome} (Horista)";
    }
}

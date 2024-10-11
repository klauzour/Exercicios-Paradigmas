class Conta
{
    private double saldo;

    public Conta(double saldoInicial)
    {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException
    {
        if (valor > saldo)
        {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
    }
}
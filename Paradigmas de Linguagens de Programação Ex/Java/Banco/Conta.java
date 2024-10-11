class ContaBancaria
{
    private final String titular;
    private double saldo;

    public ContaBancaria(String titular)
    {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor)
    {
        if (valor > 0)
        {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado com sucesso.%n", valor);
        }
        else
        {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor)
    {
        if (valor > 0 && valor <= saldo)
        {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso.%n", valor);
        }
        else
        {
            System.out.println("Saque inválido. Verifique se o valor é positivo e menor ou igual ao saldo.");
        }
    }

    public String exibirSaldo()
    {
        return String.format("Saldo atual de %s: R$%.2f", titular, saldo);
    }
}


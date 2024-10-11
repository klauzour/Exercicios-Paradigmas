public class Main
{
    public static void main(String[] args)
    {
        Conta conta = new Conta(100.00);

        try
        {
            conta.sacar(150.00);
        }
        catch (SaldoInsuficienteException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
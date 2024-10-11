import java.math.BigInteger;

class Matematica
{
    public static BigInteger fatorial(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("O fatorial não é definido para números negativos.");
        }
        else if (n == 0 || n == 1)
        {
            return BigInteger.ONE;
        }
        else
        {
            BigInteger resultado = BigInteger.ONE;
            for (int i = 2; i <= n; i++)
            {
                resultado = resultado.multiply(BigInteger.valueOf(i));
            }
            return resultado;
        }
    }
}
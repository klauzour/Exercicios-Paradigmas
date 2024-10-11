class Calculadora
{
    public double somar(double... args)
    {
        if (args.length < 2 || args.length > 3)
        {
            throw new IllegalArgumentException("O método somar aceita apenas dois ou três números.");
        }
        double soma = 0;
        for (double num : args)
        {
            soma += num;
        }
        return soma;
    }
}

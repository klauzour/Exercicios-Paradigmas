class Configuracao
{
    private static Configuracao instancia;
    private final String valor;

    // Construtor privado para impedir a criação de instâncias externas
    private Configuracao(String valor)
    {
        this.valor = valor;
    }

    // Método para obter a instância única da classe
    public static Configuracao getInstancia(String valor)
    {
        if (instancia == null)
        {
            instancia = new Configuracao(valor);
        }
        return instancia;
    }

    @Override
    public String toString()
    {
        return STR."Configuração: \{valor}";
    }
}
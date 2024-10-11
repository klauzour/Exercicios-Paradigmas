class Produto
{
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto somar(Produto outro)
    {
        if (outro != null)
        {
            return new Produto(STR."Soma de \{this.nome} e \{outro.nome}", this.preco + outro.preco);
        }
        return null; // ou lançar uma exceção
    }

    @Override
    public String toString()
    {
        return String.format("%s: R$ %.2f", nome, preco);
    }
}
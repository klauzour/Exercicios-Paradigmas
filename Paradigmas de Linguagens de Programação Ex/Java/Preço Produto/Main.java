public class Main
{
    public static void main(String[] args)
    {
        Produto produto1 = new Produto("Hidratante", 80.00);
        Produto produto2 = new Produto("Protetor Solar", 130.00);

        Produto produtoSoma = produto1.somar(produto2);

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produtoSoma);
    }
}
class Relatorio extends Imprimivel
{
    private final String titulo;
    private final String conteudo;

    public Relatorio(String titulo, String conteudo)
    {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir()
    {
        System.out.println(STR."Relatório: \{titulo}");
        System.out.println("Conteúdo:");
        System.out.println(conteudo);
    }
}
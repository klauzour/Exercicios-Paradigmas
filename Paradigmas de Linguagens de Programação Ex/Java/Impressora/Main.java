public class Main
{
    public static void main(String[] args)
    {
        Relatorio relatorio = new Relatorio("Relatório de Vendas", "Este é o conteúdo do relatório de vendas.");
        Contrato contrato = new Contrato("Empresa A", "Empresa B", "Os termos do contrato são...");

        // Imprimindo os documentos
        relatorio.imprimir();
        System.out.println();  // Linha em branco
        contrato.imprimir();
    }
}
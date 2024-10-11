class Contrato extends Imprimivel
{
    private final String parteA;
    private final String parteB;
    private final String termos;

    public Contrato(String parteA, String parteB, String termos)
    {
        this.parteA = parteA;
        this.parteB = parteB;
        this.termos = termos;
    }

    @Override
    public void imprimir()
    {
        System.out.println(STR."Contrato entre: \{parteA} e \{parteB}");
        System.out.println("Termos:");
        System.out.println(termos);
    }
}
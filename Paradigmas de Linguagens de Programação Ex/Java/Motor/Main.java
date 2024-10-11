public class Main
{
    public static void main(String[] args)
    {
        Motor motor = new Motor("Genérico");
        Carro carro = new Carro(motor);
        System.out.println(carro.detalhes());
    }
}
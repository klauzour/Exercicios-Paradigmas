public class Main
{
    public static void main(String[] args)
    {
        Configuracao config1 = Configuracao.getInstancia("Config A");
        System.out.println(config1);

        Configuracao config2 = Configuracao.getInstancia("Config B");
        System.out.println(config2);

        System.out.println(config1 == config2);
    }
}
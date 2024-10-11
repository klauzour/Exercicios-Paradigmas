public class Main
{
    public static void main(String[] args)
    {
        Animal[] animais = { new Cachorro(), new Gato(), new Vaca(), new Galo() };
        for (Animal animal : animais)
        {
            System.out.printf("O som do(a) %s é: %s%n", animal.getClass().getSimpleName(), animal.som());
        }
    }
}
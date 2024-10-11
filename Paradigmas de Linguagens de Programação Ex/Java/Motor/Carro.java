class Carro
{
    private Motor motor;

    public Carro(Motor motor)
    {
        this.motor = motor;
    }

    public String detalhes()
    {
        return "Carro com motor da marca: " + motor.getMarca();
    }
}
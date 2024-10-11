class Carro {
    private final String marca;
    private final String modelo;
    private final int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public String detalhes()
    {
        return marca + " " + modelo + " " + ano;
    }

    public void acelerar(int aumento)
    {
        velocidade += aumento;
        System.out.println("*ACELERANDO*");
        System.out.println("Sua velocidade atual é: " + velocidade + " km/h");
    }

    public void frear(int declinio)
    {
        velocidade -= declinio;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("*FREANDO*");
        System.out.println("Sua velocidade atual é: " + velocidade + " km/h");
    }

    public void exibirVelocidade()
    {
        System.out.println("Velocidade atual: " + velocidade + " km/h.");
    }
}




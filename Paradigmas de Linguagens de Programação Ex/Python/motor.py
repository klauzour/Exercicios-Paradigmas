class Motor:
    def __init__(self, marca):
        self.marca = marca

class Carro:
    def __init__(self, motor):
        self.motor = motor  # Deve ser uma instância da classe Motor

    def detalhes(self):
        return f"Carro com motor da marca: {self.motor.marca}"

def main():
    motor = Motor("Genérico")
    carro = Carro(motor)
    print(carro.detalhes())

if __name__ == "__main__":
    main()

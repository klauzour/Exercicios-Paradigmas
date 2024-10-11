class Calculadora:
    def somar(self, *args):
        if len(args) < 2 or len(args) > 3:
            raise ValueError("O método somar aceita apenas dois ou três números.")
        return sum(args)


def main():
    calc = Calculadora()

    while True:
        print("\nCalculadora")
        print("1. Somar dois números")
        print("2. Somar três números")
        print("3. Sair")
        escolha = input("Escolha uma opção (1/2/3): ")

        if escolha == '1':
            try:
                num1 = float(input("Digite o primeiro número: "))
                num2 = float(input("Digite o segundo número: "))
                resultado = calc.somar(num1, num2)
                print(f"Soma de {num1} e {num2}: {resultado}")
            except ValueError as e:
                print("Entrada inválida. Por favor, insira números válidos.")

        elif escolha == '2':
            try:
                num1 = float(input("Digite o primeiro número: "))
                num2 = float(input("Digite o segundo número: "))
                num3 = float(input("Digite o terceiro número: "))
                resultado = calc.somar(num1, num2, num3)
                print(f"Soma de {num1}, {num2} e {num3}: {resultado}")
            except ValueError as e:
                print("Entrada inválida. Por favor, insira números válidos.")

        elif escolha == '3':
            print("Saindo...")
            break

        else:
            print("Opção inválida. Tente novamente.")


if __name__ == "__main__":
    main()

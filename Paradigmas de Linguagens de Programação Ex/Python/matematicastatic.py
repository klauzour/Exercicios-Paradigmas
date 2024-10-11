class Matematica:
    @staticmethod
    def fatorial(n):
        if n < 0:
            raise ValueError("O fatorial não é definido para números negativos.")
        elif n == 0 or n == 1:
            return 1
        else:
            resultado = 1
            for i in range(2, n + 1):
                resultado *= i
            return resultado

def main():
    numero = int(input("Digite um número para calcular o fatorial: "))
    try:
        fatorial = Matematica.fatorial(numero)
        print(f"O fatorial de {numero} é {fatorial}.")
    except ValueError as e:
        print(e)

if __name__ == "__main__":
    main()
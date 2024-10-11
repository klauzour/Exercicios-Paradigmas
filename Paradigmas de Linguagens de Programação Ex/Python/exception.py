class SaldoInsuficienteException(Exception):
    def __init__(self, mensagem):
        super().__init__(mensagem)

# Exemplo de uso
class Conta:
    def __init__(self, saldo_inicial):
        self.saldo = saldo_inicial

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException("Saldo insuficiente para realizar o saque.")
        self.saldo -= valor
        return self.saldo

def main():
    conta = Conta(100.00)

    try:
        conta.sacar(150.00)
    except SaldoInsuficienteException as e:
        print(e)

if __name__ == "__main__":
    main()

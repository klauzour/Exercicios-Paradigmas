class ContaBancaria:
    def __init__(self, titular):
        self.titular = titular
        self.__saldo = 0.0

    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor
            print(f"Depósito de R${valor:.2f} realizado com sucesso.")
        else:
            print("O valor do depósito deve ser positivo.")

    def sacar(self, valor):
        if 0 < valor <= self.__saldo:
            self.__saldo -= valor
            print(f"Saque de R${valor:.2f} realizado com sucesso.")
        else:
            print("Saque inválido. Verifique se o valor é positivo e menor ou igual ao saldo.")

    def exibir_saldo(self):
        return f"Saldo atual de {self.titular}: R${self.__saldo:.2f}"
    
##Interação com o usuário    
def main():
    titular = input("Digite o nome do titular da conta: ")
    conta = ContaBancaria(titular)

    while True:
        acao = input("Você deseja sacar ou depositar? (digite 'sacar', 'depositar' ou 'sair'): ").strip().lower()
        
        if acao == 'sacar':
            valor = float(input("Digite o valor a ser sacado:"))
            conta.sacar(valor)
        elif acao == 'depositar':
            valor = float(input("Digite o valor a ser depositado:"))
            conta.depositar(valor)
        elif acao == 'sair':
            break
        else:
            print("Ação inválida. Tente novamente.")

    # Exibindo extrato final
    print("\nExtrato da Conta:")
    print(conta.exibir_saldo())

# Executando o programa
if __name__ == "__main__":
    main()

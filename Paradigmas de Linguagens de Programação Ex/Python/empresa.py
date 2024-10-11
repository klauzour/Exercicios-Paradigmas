class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def __str__(self):
        return f"{self.nome} - {self.cargo} - R$ {self.salario:.2f}"


class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)

    def listar_empregados(self):
        if not self.empregados:
            print("Nenhum empregado cadastrado.")
        else:
            for empregado in self.empregados:
                print(empregado)

    def calcular_folha_pagamento(self):
        return sum(empregado.salario for empregado in self.empregados)

    def __str__(self):
        return self.nome


def main():
    empresa = Empresa("JPA HIPOTETICA")
    empresa.adicionar_empregado(Empregado("Gabriel Carvalho", "Desocupado", 0))

    while True:
        print("\nMenu:")
        print("1. Adicionar Empregado")
        print("2. Listar Empregados")
        print("3. Calcular Folha de Pagamento")
        print("4. Sair")
        escolha = input("Escolha uma opção: ")

        if escolha == '1':
            nome = input("Digite o nome do empregado: ")
            cargo = input("Digite o cargo do empregado: ")
            salario = float(input("Digite o salário do empregado: "))
            empregado = Empregado(nome, cargo, salario)
            empresa.adicionar_empregado(empregado)
            print(f"Empregado '{nome}' adicionado.")

        elif escolha == '2':
            print(f"\nEmpregados da empresa '{empresa}':")
            empresa.listar_empregados()

        elif escolha == '3':
            total_folha = empresa.calcular_folha_pagamento()
            print(f"Total da folha de pagamento: R$ {total_folha:.2f}")

        elif escolha == '4':
            print("FINALIZANDO...")
            break

        else:
            print("Opção inválida, Tente novamente.")

if __name__ == "__main__":
    main()

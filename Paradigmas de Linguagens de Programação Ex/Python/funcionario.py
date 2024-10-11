from abc import ABC, abstractmethod

class Funcionario(ABC):
    @abstractmethod
    def calcularSalario(self):
        pass


class FuncionarioHorista(Funcionario):
    def __init__(self, nome, horas_trabalhadas, valor_hora):
        self.nome = nome
        self.horas_trabalhadas = horas_trabalhadas
        self.valor_hora = valor_hora

    def calcularSalario(self):
        return self.horas_trabalhadas * self.valor_hora

    def __str__(self):
        return f"{self.nome} (Horista)"


class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, salario_mensal):
        self.nome = nome
        self.salario_mensal = salario_mensal

    def calcularSalario(self):
        return self.salario_mensal

    def __str__(self):
        return f"{self.nome} (Assalariado)"


def main():
    funcionarios = [
        FuncionarioHorista("Milena Sicrana", 160, 25),  
        FuncionarioAssalariado("Fulano Beltrano", 10000),    
        FuncionarioHorista("Ricardo Curioso", 180, 5), 
        FuncionarioAssalariado("Diana Moon", 25000)    
    ]

    while True:
        print("\nMenu:")
        print("1. Adicionar Funcionário Horista")
        print("2. Adicionar Funcionário Assalariado")
        print("3. Listar Funcionários e Salários")
        print("4. Sair")
        escolha = input("Escolha uma opção (1/2/3/4): ")

        if escolha == '1':
            nome = input("Digite o nome do funcionário: ")
            horas_trabalhadas = float(input("Digite o número de horas trabalhadas: "))
            valor_hora = float(input("Digite o valor por hora: "))
            funcionario = FuncionarioHorista(nome, horas_trabalhadas, valor_hora)
            funcionarios.append(funcionario)
            print(f"Funcionário {nome} adicionado como horista.")

        elif escolha == '2':
            nome = input("Digite o nome do funcionário: ")
            salario_mensal = float(input("Digite o salário mensal: "))
            funcionario = FuncionarioAssalariado(nome, salario_mensal)
            funcionarios.append(funcionario)
            print(f"Funcionário {nome} adicionado como assalariado.")

        elif escolha == '3':
            print("\nFuncionários cadastrados:")
            for funcionario in funcionarios:
                print(f"{funcionario}: Salário = R$ {funcionario.calcularSalario():.2f}")

        elif escolha == '4':
            print("Saindo...")
            break

        else:
            print("Opção inválida. Tente novamente.")


if __name__ == "__main__":
    main()

class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def detalhes(self):
        return f"{self.marca} {self.modelo} {self.ano}"
    
    def acelerar(self, aumento):
        self.velocidade += aumento
        print("*ACELERANDO*")
        print(f"sua velocidade atual é: {self.velocidade} km/h")

    def frear(self, declinio):
        self.velocidade -= declinio
        if self.velocidade < 0 :
            self.velocidade = 0
        print("*FREANDO*")
        print(f"sua velocidade atual é: {self.velocidade} km/h")

    def exibir_velocidade(self):
         print(f"Velocidade atual: {self.velocidade} km/h.")
    
## CARROS EM ESTOQUE
garagem = [
    Carro("Hyundai", "HB20", 2024),
    Carro("Fiat", "mobi", 2018),
    Carro("Tesla", "Cybertruck", 2023)
]

## EXIBIÇÃO DOS DETALHES
print("Nós temos em nossas garagens:")
for i, Carro in enumerate(garagem):  
    print(f"{i + 1}: {Carro.detalhes()}")   

## INTERAÇÃO COM O USUÁRIO
escolha = int(input("Digite o número do carro que você deseja escolher: ")) - 1

if 0 <= escolha < len (garagem):
    carro_selecionado = garagem[escolha]
    print(f"você escolheu: {carro_selecionado.detalhes()}")

    while True:
        comando = input("Digite um comando (acelerar, frear, velocidade, sair): ").strip().lower()
        
        if comando == "acelerar":
            aumento = int(input("Quanto deseja acelerar? (em km/h): "))
            carro_selecionado.acelerar(aumento)
        elif comando == "frear":
            declinio = int(input("Quanto deseja frear? (em km/h): "))
            carro_selecionado.frear(declinio)
        elif comando == "velocidade":
            carro_selecionado.exibir_velocidade()
        elif comando == "sair":
            print("Saindo...")
            break
        else:
            print("Comando inválido. Tente novamente.")
else:
    print("Escolha inválida. Encerrando o programa.")
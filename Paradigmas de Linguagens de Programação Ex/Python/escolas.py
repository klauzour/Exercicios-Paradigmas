class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.Professores = []

## ADICIONAR PROFESSORES A ESCOLA
    def contratar(self, professor):
        if professor not in self.Professores:
            self.Professores.append(professor)
            professor.lecionar(self)

    def __str__(self):
        return self.nome
        
        
class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.Escolas = []

## ADICIONAR ESCOLAS AOS PROFESSORES
    def lecionar(self, escola):
        if escola not in self.Escolas:
            self.Escolas.append(escola)
            escola.contratar(self)

    def __str__(self):
        return self.nome
    
## MENU
def main():
    Escolas = [
        Escola("IRB"),
        Escola("IFPB")
    ]
    Professores = [
        Professor("Daniel Matos"),
        Professor("Fulano da Silva")
    ]

    escola_irb = Escolas[0]
    escola_ifpb = Escolas[1]
    professor_Daniel = Professores[0]    
    professor_fulano = Professores[1]
    professor_fulano.lecionar(escola_irb)
    professor_fulano.lecionar(escola_ifpb)
    professor_Daniel.lecionar(escola_ifpb)

    while True:
        print("\nMenu:")
        print("(1) Exibir informações")
        print("(2) Adicionar escola")
        print("(3) Adicionar professor")
        print("(4) Associar professor a escola")
        print("(5) SAIR")
        escolha = input("Selecione uma opção: ")

        if escolha == '1':
            for escola in Escolas:
                print(f"\nDocentes do {escola}: {[str(professor) for professor in escola.Professores]}")        
            for professor in Professores:
                print(f"Onde {professor} leciona: {[str(escola) for escola in professor.Escolas]}")

        elif escolha == '2':
            nome_escola = input("Digite aqui o nome da escola: ")
            escola = Escola(nome_escola)
            Escolas.append(escola)
            print(f"Escola '{nome_escola} adicionada")

        elif escolha == '3':
            nome_professor = input("Digite aqui o nome do docente: ")
            professor = Professor(nome_professor)
            Professores.append(professor)
            print(f"Docente '{nome_professor} adicionado")

        elif escolha == '4':
            nome_professor = input("Digite o nome do docente: ")
            nome_escola = input("Digite o nome da escola: ")
            professor = next((p for p in Professores if p.nome == nome_professor), None)
            escola = next((e for e in Escolas if e.nome == nome_escola), None)

            if professor and escola:
                professor.lecionar(escola)
                print(f"Professor '{nome_professor}' associado a escola '{nome_escola}'.")
            else:
                print("Professor ou escola não encontrados.")

        elif escolha == '5':
            print('FINALIZANDO...')
            break
        else:
            print('ESCOLHA INVÁLIDA, tente novamente.')

if __name__ == "__main__":
    main()            


from abc import ABC, abstractmethod

class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass


class Relatorio(Imprimivel):
    def __init__(self, titulo, conteudo):
        self.titulo = titulo
        self.conteudo = conteudo

    def imprimir(self):
        print(f"Relatório: {self.titulo}")
        print("Conteúdo:")
        print(self.conteudo)


class Contrato(Imprimivel):
    def __init__(self, parte_a, parte_b, termos):
        self.parte_a = parte_a
        self.parte_b = parte_b
        self.termos = termos

    def imprimir(self):
        print(f"Contrato entre: {self.parte_a} e {self.parte_b}")
        print("Termos:")
        print(self.termos)


def main():
    relatorio = Relatorio("Relatório de Vendas", "Este é o conteúdo do relatório de vendas.")
    contrato = Contrato("Empresa A", "Empresa B", "Os termos do contrato são...")

    # Imprimindo os documentos
    relatorio.imprimir()
    print()  # Linha em branco
    contrato.imprimir()


if __name__ == "__main__":
    main()

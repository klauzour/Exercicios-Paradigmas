class Configuracao:
    _instancia = None

    def __new__(cls, *args, **kwargs):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls)
            cls._instancia._inicializar(*args, **kwargs)
        return cls._instancia

    def _inicializar(self, valor=None):
        self.valor = valor

    def __str__(self):
        return f"Configuração: {self.valor}"

def main():
    config1 = Configuracao("Config A")
    print(config1)  

    config2 = Configuracao("Config B")
    print(config2)  

    print(config1 is config2)  

if __name__ == "__main__":
    main()

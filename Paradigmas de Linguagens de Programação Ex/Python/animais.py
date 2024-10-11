class animal:
    def som(self):
        raise NotImplementedError("Herança.")
    
class Cachorro(animal):
        def som(self):
            return "Woof Woof"
        
class Gato(animal):
        def som(self):
            return "Minhauuuu"
        
class Vaca(animal):
        def som(self):
            return "Muuuuu"
        
class Galo(animal):
        def som(self):
            return "Cócoricó"
        
def main():
    animais = [Cachorro(), Gato(), Vaca(), Galo()]
    for animal in animais:
        print(f"O som do(a) {animal.__class__.__name__} é: {animal.som()}")

if __name__ == "__main__":
    main()
    

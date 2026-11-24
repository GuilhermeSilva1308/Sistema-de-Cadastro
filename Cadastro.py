class Cadastro:

    lista_de_cadastros = []

    def __init__(self, nome, idade, email):
        self.nome = nome
        self.idade = idade
        self.email = email
        Cadastro.lista_de_cadastros.append(self)
        

    def exibir_dados (self):
        print("------------------------------------------------------------")
        print(f"Nome: {self.nome}")
        print(f"Idade: {self.idade} anos")
        print(f"E-mail: {self.email}")


    @classmethod
    def exibir_lista_de_cadastros (self):
        for Cadastro in self.lista_de_cadastros:
            Cadastro.exibir_dados()

    
    
            

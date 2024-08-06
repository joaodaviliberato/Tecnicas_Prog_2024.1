nome_login = "Joao Davi"
senha_login = "123456"

while True:
    nome_usuario = input("Digite seu nome: ")
    senha_usuario = input("Digite sua senha: ")

    if nome_usuario == nome_login and senha_usuario == senha_login:
        print("Credenciais validas")
        break
    else:
        print("Credenciais invalidas. Por favor, verifique seu nome de usuario e senha e tente novamente.")
        continue
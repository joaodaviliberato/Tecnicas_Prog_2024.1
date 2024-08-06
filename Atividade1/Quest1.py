while True:
    idade_usuario = int(input("Digite a sua idade: "))
    if idade_usuario < 0: 
        print("Digite uma idade válida!")
        continue
    if idade_usuario <= 12 and idade_usuario >= 0:
        print("Crianca")
        break
    elif idade_usuario >= 13 and idade_usuario <= 17:
        print("Adolescente") 
        break
    elif idade_usuario >= 18:
        print("Adulto")
        break

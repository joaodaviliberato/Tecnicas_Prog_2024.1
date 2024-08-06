while True:
    idade_usuario = int(input("Digite a sua idade(inteira): "))
    if idade_usuario < 0 :
        print("Digite uma idade válida!")
        continue
    idade_usuario = int(idade_usuario)
    if idade_usuario < 13:
        print("Crianca")
        break
    elif idade_usuario >= 13 and idade_usuario <= 19:
        print("Adolescente") 
        break
    elif idade_usuario >= 20 and idade_usuario <= 29:
        print("Adulto jovem")
        break
    elif idade_usuario >= 30:
        print("Adulto")
        break

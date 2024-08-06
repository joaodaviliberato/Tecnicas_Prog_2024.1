while True:
    lado1 = input("Digite o valor do primeiro lado: ").replace(',', '.')
    lado2 = input("Digite o valor do segundo lado: ").replace(',', '.')
    lado3 = input("Digite o valor do terceiro lado: ").replace(',', '.')
    
    if float(lado1) <= 0 or float(lado2) <= 0 or float(lado3) <= 0:
        print("Digite valores válidos para os lados")
        continue
    
    elif float(lado1) >= float(lado2) + float(lado3) or float(lado2) >= float(lado1) + float(lado3) or float(lado3) >= float(lado1) + float(lado2):
        print("Não é possível formar um triângulo com esses valores")
        continue
    
    lado1 = float(lado1)
    lado2 = float(lado2)
    lado3 = float(lado3)
    
    if lado1 == lado2 and lado2 == lado3:
        print("Triângulo equilátero")
        break
    elif lado1 == lado2 or lado2 == lado3 or lado1 == lado3:
        print("Triângulo isósceles")
        break
    else:
        print("Triângulo escaleno")
        break
    
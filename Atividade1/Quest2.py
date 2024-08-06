while True:
    peso_usuario = input("Digite o seu peso em kg: ").replace(',', '.')
    altura_usuario = input("Digite a sua altura em metros: ").replace(',', '.')

    if float(peso_usuario) <= 0.0 or float(altura_usuario) <= 0.0:
        print("Digite um peso e altura válidos!")
        continue
    
    peso_usuario = float(peso_usuario)
    altura_usuario = float(altura_usuario)
    
    imc = peso_usuario / (altura_usuario ** 2)
    condicao_usuario = ""

    if imc < 18.5:
        condicao_usuario = "Abaixo do peso"
        break
    elif imc >= 18.5 and imc < 25:
        condicao_usuario = "Peso normal"
        break
    elif imc >= 25 and imc < 30:
        condicao_usuario = "Sobrepeso"
        break
    elif imc >= 30:
        condicao_usuario = "Obesidade"
        break

print( "IMC = {:.2f}".format(imc))
print("Condição do Usuario: " + condicao_usuario)
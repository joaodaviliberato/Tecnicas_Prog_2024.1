media = 0.0
soma = 0
quantidade_numeros = 0

while True:
    numero = int(input("Digite um número: "))
    
    if numero < 0:
        print("Número negativo. Encerrando o programa.")
        break
    elif numero > 0:
        soma += numero
        quantidade_numeros += 1
        media = soma/quantidade_numeros
        print(f"A média é: {media:.2f}")
    else:
        print("Digite um número diferente de zero!")
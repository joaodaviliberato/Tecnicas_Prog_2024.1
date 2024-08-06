from random import randint

numero_computador = randint(1, 100)
tentativas = 0

while True:
    print(f"Tentativas : {tentativas}")
    numero_usuario = int(input("Digite um número inteiro entre 0 e 100: "))

    if numero_usuario < 0:
        print("Número negativo. Encerrando o programa.")
        break
    elif numero_usuario > 100:
        print("Digite um número válido! Entre 1 e 100.")
        continue
    elif numero_usuario == numero_computador:
        print(f"Parabéns, você acertou em {tentativas} tentativa(s)!")
        tentativas += 1
        break
    else:
        print("Você errou! Tente novamente. ", end='')
        tentativas += 1
        if numero_usuario > numero_computador:
            print(f"O número é menor que {numero_usuario}!")
        if numero_usuario < numero_computador:
            print(f"O número é maior que {numero_usuario}!")
        continue
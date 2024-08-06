from random import randint
    
while True:
    
    numero1 = randint(1, 10)
    numero2 = randint(1, 10)
    resposta = int(input(f"Quanto é {numero1} x {numero2}? (Digite 1 para sair) "))
    
    if resposta == 1:
        print("FIM do programa.")
        break
    elif resposta == numero1 * numero2:
        print("Resposta correta!")
    else:
        print("Resposta errada! Tente novamente.")
        while resposta != numero1 * numero2:
            resposta = int(input(f"Quanto é {numero1} x {numero2}? (Digite 1 para sair) "))
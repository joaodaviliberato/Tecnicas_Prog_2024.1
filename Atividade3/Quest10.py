def maior_numero(num1, num2, num3):
    if num1 > num2 and num1 > num3:
        maior = num1
    elif num2 > num1 and num2 > num3:
        maior = num2
    elif num3 > num1 and num3 > num2:
        maior = num3
    else:
        return "Os numeros nao sao distintos!"
    return maior
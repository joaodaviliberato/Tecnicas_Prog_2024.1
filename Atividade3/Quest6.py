def soma_impares(lista):
    soma = 0
    for num in lista:
        if num % 2 != 0:
            soma += num
    return soma

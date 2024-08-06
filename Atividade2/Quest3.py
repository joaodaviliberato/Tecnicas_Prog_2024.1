while True:
    numero = int(input("Digite um número inteiro não negativo: "))
    if numero < 0:
        print("Digite um número válido!")
        continue
    break

fatorial = 1
print(f'{numero}! = ', end = '')

for i in range(numero, 0, -1):
    print(i, end = '')
    print(' x ' if i > 1  else ' = ', end = '')
    fatorial *= i
print(fatorial)
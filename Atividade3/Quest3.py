lista = list()

for i in range(10):
    num = int(input("Digite um numero inteiro: "))
    lista.append(num)
    
for num in lista:
    if num % 3 == 0:
        print(num)
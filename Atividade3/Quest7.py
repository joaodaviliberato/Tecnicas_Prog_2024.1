def ehprimo(num):
    if num <= 1:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

lista = list()
positivos = 0
negativos = 0
zeros = 0
primo = False

for i in range(10):
    num = int(input("Digite um numero: "))
    lista.append(num)
    if num > 0:
        positivos += 1
    elif num < 0:
        negativos += 1
    else:
        zeros += 1
    if ehprimo(num):
        primo = True

print(f"Positivos: {positivos}")
print(f"Negativos: {negativos}")
print(f"Zeros: {zeros}")
if primo:
    print("A lista contem pelo menos um numero primo.")

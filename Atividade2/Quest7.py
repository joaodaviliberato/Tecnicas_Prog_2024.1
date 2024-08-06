numero = int(input("Digite um número para ver a tabuada: "))
numero_linhas = int(input("Digite o número de linhas da tabuada: "))

print(13*'---')
for i in range(1, numero_linhas + 1): 
    print(f"{numero} x {i} = {numero * i}")
print(13*'---')
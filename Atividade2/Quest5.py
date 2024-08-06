lista = input("Digite uma lista de números separados por espaços: ")

lista_numeros = [int(numero) for numero in lista.split()]

if all(num % 2 != 0 for num in lista_numeros): 
    print("Sequência de números ímpares")

if all(num % 2 == 0 for num in lista_numeros):
    print("Sequência de números pares")
    
if len(set(lista_numeros)) != len(lista_numeros):
    print("Sequência de números repetidos")

elif lista_numeros == sorted(lista_numeros) and lista_numeros != lista_numeros[::-1]:
        print("Sequência de números crescente")
        
elif lista_numeros == sorted(lista_numeros, reverse=True) and lista_numeros != lista_numeros[::-1]:
    print("Sequência de números decrescente")
        
else:
    print("Não foi possível identificar um padrão na lista.")
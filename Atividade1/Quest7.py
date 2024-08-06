nota_total = 0.0
peso_total = 0.0
while True:
    numero_disciplinas = int(input("Digite o número de disciplinas em que você está matriculado(a): "))
    
    if numero_disciplinas <= 0:
        print("Digite um número de disciplinas válido!")
        continue
    break
  
for i in range(numero_disciplinas):
    while True:
        nota = input(f"Digite a nota da disciplina {i+1}: ").replace(',', '.')
        peso = int(input(f"Digite o peso(inteiro) da disciplina {i+1}: "))
        
        if peso <= 0 or float(nota) < 0.0 or float(nota) > 10.0:
            print("Digite nota e peso válidos!")
            continue
        
        nota = float(nota)
        peso = int(peso)
        break
        
    nota_total += nota * peso
    peso_total += peso

media_ponderada = nota_total / peso_total
print(f"A média ponderada do aluno é {media_ponderada:.2f}")
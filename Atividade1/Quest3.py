while True :
  nota1 = input("Digite a nota 1: ").replace(',', '.')
  nota2 = input("Digite a nota 2: ").replace(',', '.')
  nota3 = input("Digite a nota 3: ").replace(',', '.')
  
  if float(nota1) < 0.0 or float(nota2) < 0.0 or float(nota3) < 0.0 or float(nota1) > 10.0 or float(nota2) > 10.0 or float(nota3) > 10.0:
    print("Digite notas validas")
    continue
  
  nota1 = float(nota1)
  nota2 = float(nota2)
  nota3 = float(nota3)
    
  media = (nota1+nota2+nota3)/3
  condicao_aluno = ""

  if media >= 0.0 and media <= 4:
    condicao_aluno = "Reprovado"
    break
  elif media >= 4.1 and media <= 6.0 :
    print("Pegou exame")
    while True :                  
      nota_exame = input("Digite a nota do exame: ").replace(',', '.')
      
      if float(nota_exame) < 0.0 or float(nota_exame) > 10.0:
        print("Digite uma nota valida para o exame")
        continue
      
      nota_exame = float(nota_exame)
  
      if nota_exame >= 6.0:
        condicao_aluno = "Aprovado"
        break
      else:
        condicao_aluno = "Reprovado"
        break
    break
  elif media > 6.0 :
      condicao_aluno = "Aprovado"
      break

print("Aluno " + condicao_aluno)
while True:
    numero_itens = int(input("Digite o número de itens comprados: "))

    if numero_itens <= 0:
        print("Digite um número de itens válido!")
        continue
    
    custo_total = 0.0
    
    for i in range(numero_itens):
        while True:
            preco = input(f"Digite o preço do item {i+1}: ").replace(',', '.')
            preco = float(preco)
            
            if float(preco) <= 0.0:
                print("Digite um preço válido!")
                continue
            
            custo_total += preco
            break
        
    desconto = custo_total * 0.10

    if custo_total >= 100:
        custo_total = custo_total - desconto
        
    if custo_total >= 200:
        custo_total -= 20

    print(f"O custo total da compra após a aplicação dos descontos é R$ {custo_total:.2f}.")

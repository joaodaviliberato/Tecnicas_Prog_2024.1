while True:
    preco_venda = input("Digite o preço de venda: ").replace(',','.')
    numero_avaliacoes = int(input("Digite o número(inteiro) de avaliações: "))

    if float(preco_venda) <= 0.00 or numero_avaliacoes <= 0:
        print("Digite valores válidos")
        continue
    
    else:
        preco_venda = float(preco_venda)
        print("O produto é: ")
        if preco_venda < 50.00:
            print("ECONOMICO")
        elif preco_venda >= 50.00 and preco_venda <= 100.00:
            print("PADRAO")
        elif preco_venda > 100.00:
            print("PREMIUM")
        
        if numero_avaliacoes >= 100:
            print("POPULAR")
        elif numero_avaliacoes < 100:
            print("REGULAR")
        break


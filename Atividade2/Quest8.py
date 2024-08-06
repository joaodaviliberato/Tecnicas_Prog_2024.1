while True:
    print(8 * '-=-' + "MENU" + 8 * '-=-')
    print("[1] - Quadrado\n[2] - Retângulo\n[3] - Triângulo\n[4] - Sair do programa")
    opcao = int(input("Escolha uma opção: "))

    if opcao == 1:
        lado = float(input("Digite o lado do quadrado: "))
        print(f"A área do quadrado é {lado ** 2:.2f}")
    elif opcao == 2:
        base = float(input("Digite a base do retângulo: "))
        altura = float(input("Digite a altura do retângulo: "))
        print(f"A área do retângulo é {base * altura}")
    elif opcao == 3:
        base = float(input("Digite a base do triângulo: "))
        altura = float(input("Digite a altura do triângulo: "))
        print(f"A área do triângulo é {(base * altura) / 2}")
    elif opcao == 4:
        print("FIM do programa.")
        break
    else:
        print("Opção inválida!")
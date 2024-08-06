imagens_treinamento = [
    "gato", "cachorro", "gato", "pássaro", "gato", "cachorro", "cachorro",
    "gato", "pássaro", "cachorro", "gato", "gato", "pássaro", "pássaro"
]

gato = cachorro = passaro = 0

for i in range(len(imagens_treinamento)):
    if imagens_treinamento[i] == "gato":
        gato += 1
    elif imagens_treinamento[i] == "cachorro":
        cachorro += 1
    else:
        passaro += 1

print(f"O gato apareceu {gato} vezes, o cachorro {cachorro} vezes e o pássaro {passaro} vezes.")
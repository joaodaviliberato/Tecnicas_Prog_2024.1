vogais = 0
i = 0

frase = str(input("Digite uma frase: ")).lower()

while i < len(frase):
    if frase[i] in "aeiou":
        vogais += 1
    i += 1
    
print(f"A frase tem {vogais} vogais")
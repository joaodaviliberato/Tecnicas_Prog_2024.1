emails = []
while True:
    email = input("Digite seu email: ").lower().strip()

    if email in emails:
        print("Email já cadastrado!")
    else:    
        emails.append(email)
        print("Email cadastrado com sucesso!")

    continuar = input("Deseja continuar? [S/N] ").strip().upper()
    if continuar == "N":
        break
    
print(f"Emails cadastrados: {emails}")
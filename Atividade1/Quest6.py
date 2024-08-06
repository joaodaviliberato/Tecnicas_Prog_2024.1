tarifa_base = 5.00
while True:
    distância_percorrida = input("Digite a distância percorrida em km: ")
    distância_percorrida = distância_percorrida.replace(',', '.')
    if float(distância_percorrida) <= 0:
        print("Digite uma distância válida!")
        continue
    else:
        distância_percorrida = float(distância_percorrida)
        break
    
preço_por_km = 2.00 * distância_percorrida
preço_total = tarifa_base + preço_por_km
if distância_percorrida >= 20:
    preço_total *= 0.90
print(f"O preço total da viagem é de R${preço_total:.2f}")


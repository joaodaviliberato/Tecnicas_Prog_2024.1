def lista_ao_cubo(lista):
    if all(isinstance(x, (int, float)) for x in lista):
        return [x**3 for x in lista]
    else:
        return "Os numeros nao sao validos."
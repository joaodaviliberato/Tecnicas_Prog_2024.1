def fatorial(num):
    if num < 0:
        return "Numero invalido"
    elif num == 0:
        return 1
    else:
        fatorial = 1
        while num > 1:
            fatorial *= num
            num -= 1
        return fatorial
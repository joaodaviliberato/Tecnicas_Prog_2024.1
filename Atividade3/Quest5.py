def media_aritmetica(num1, num2):
    if isinstance(num1, (int, float)) and isinstance(num2, (int, float)):
        return (num1 + num2) / 2
    else:
        return "Os números não são válidos"
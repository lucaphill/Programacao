# Programa que soma valores binarios
soma = 0

n1 = input("Insira um numero binario para ser somado: ")
n2 = input("Insira outro numero binario para ser somado: ")


soma = bin(int(n1, 2) + int(n2, 2))

print(f"A soma de {n1} com {n2} é: ")
print(soma)
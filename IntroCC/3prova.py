"""
Algoritmo: organiza_matérias
VAR:
	materia: caractere
    importancia: inteiro
    



"""
agenda = {}
n = int(input("Quantas matérias tem provas nos próximos 14 dias?"))

for _ in range(n):
    materia = input("Mátéria: ")
    importancia = input("Importância: ")

    agenda[materia] = (importancia)
    
materias_organizadas = dict(sorted(agenda.items(), key=lambda item: item[1]))

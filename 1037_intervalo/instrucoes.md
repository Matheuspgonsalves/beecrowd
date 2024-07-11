### Problema

Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
- [0,25] indica valores entre 0 e 25.0000, inclusive.
- (25,50] indica valores maiores que 25 até o valor 50.0000000.

### Entrada

O arquivo de entrada contém um número com ponto flutuante qualquer.

### Saída

A saída deve ser uma mensagem conforme o intervalo em que o valor se encontra ou "Fora de intervalo", se não estiver em nenhum dos intervalos especificados.

### Exemplo

| Exemplo de Entrada | Exemplo de Saída |
|--------------------|------------------|
| 25.01              | Intervalo (25,50] |
| 25.00              | Intervalo [0,25]  |
| 100.00             | Intervalo (75,100] |
| -25.02             | Fora de intervalo |

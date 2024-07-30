using System;
using System.Globalization;

class URI {
    static void Main(string[] args) {
        // Define a cultura para usar ponto como separador decimal
        CultureInfo culture = CultureInfo.InvariantCulture;

        // Leitura de N
        int N = int.Parse(Console.ReadLine());

        // Declaração dos arrays necessários
        float[,] arrayBi = new float[N, 3];
        float[] arrayCalculo = new float[N];

        // Leitura do array bidimensional
        for (int i = 0; i < N; i++) {
            string input = Console.ReadLine();
            string[] valores = input.Split(' ');

            arrayBi[i, 0] = float.Parse(valores[0], culture);
            arrayBi[i, 1] = float.Parse(valores[1], culture);
            arrayBi[i, 2] = float.Parse(valores[2], culture);
        }

        // Multiplicando a nota pelos respectivos pesos
        for (int i = 0; i < N; i++) {
            arrayBi[i, 0] *= 2;
            arrayBi[i, 1] *= 3;
            arrayBi[i, 2] *= 5;
        }

        // Calculando a média ponderada
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 3; j++){
                arrayCalculo[i] += arrayBi[i,j];
            }
            arrayCalculo[i] /= 10;
        }

        // Saída para usuário
        for (int i = 0; i < N; i++) {
            Console.WriteLine(arrayCalculo[i].ToString("F1", culture));
        }
    }
}

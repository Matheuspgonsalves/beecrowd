using System;
using System.Globalization;

class URI {

    static void Main(string[] args) { 
        //declaracao do array
        int[] array = new int[100];

        //Leitura do array
        for(int i = 0; i < array.Length; i++){
            array[i] = int.Parse(Console.ReadLine());
        }

        int maiorNum = array[0], numIndice = 0;//Variavel para armazenar o maior valor e o indice

        //Encontra o maior valor e o indice
        for(int i = 1; i < array.Length; i++){  
            if(array[i] > array[numIndice]){
                maiorNum = array[i];
                numIndice = i;
            }
        }

        Console.WriteLine(maiorNum);
        Console.WriteLine(numIndice+1);

    }

}
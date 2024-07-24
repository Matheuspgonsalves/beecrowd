import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        int []numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(sc.readLine());
        }

        int qtdInt = quantidadeInt(numeros);

        imprime(qtdInt);
        sc.close();
    }

    public static int quantidadeInt(int[] n){
        int i = 0, count = 0;
        while(i < n.length){
            if(n[i] % 2 == 0){
                count++;
            }
            i++;
        }
        return count;
    }
    
    public static void imprime(int n){
        System.out.println(n + " valores pares");
    }
}
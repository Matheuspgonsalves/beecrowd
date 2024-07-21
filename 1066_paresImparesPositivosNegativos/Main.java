import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(sc.readLine());
        }

        int pares = numPares(numeros);
        int impares = numImpares(numeros);
        int positivos = numPositivos(numeros);
        int negativos = numNegativos(numeros);

        imprime(pares, impares, positivos, negativos);

        sc.close();
    }

    public static int numPares(int[] n){
        int count = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int numImpares(int[] n){
        int count = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public static int numPositivos(int[] n){
        int count = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i] > 0){
                count++;
            }
        }
        return count;
    }

    public static int numNegativos(int[] n){
        int count = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i] < 0){
                count++;
            }
        }
        return count;
    }

    public static void imprime(int np, int ni, int n_po, int n_ne){
        System.out.println(np + " valor(es) par(es)");
        System.out.println(ni + " valor(es) impar(es)");
        System.out.println(n_po + " valor(es) positivo(s)");
        System.out.println(n_ne + " valor(es) negativo(s)");
    }
 
}
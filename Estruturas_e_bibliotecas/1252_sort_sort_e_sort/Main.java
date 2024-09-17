import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        String in = sc.nextLine();

        while(verificaFim(in)){
            String[] partes = in.split(" ");

            int n = Integer.parseInt(partes[0]);
            int m = Integer.parseInt(partes[1]);

            int[] vetorNums = new int[n];

            for(int i = 0; i < vetorNums.length; i++){
                vetorNums[i] = sc.nextInt();
            }

            int[] vetorOrdenado = ordenaVetor(vetorNums);

            for(int i = 0; i < vetorOrdenado.length; i++){
                System.out.println(vetorOrdenado[i]);
            }
            in = sc.nextLine();
        }
    }

    public static int[] ordenaVetor(int[] vetor){
        int aux;
        for(int i = 0; i < (vetor.length - 1); i++){
            int menor = i;
            for(int j = i + 1; i < vetor.length; i++){
                int maior = j;
                if(vetor[i] % 3 == 0 && vetor[j] % 3 == 0){
                    if(vetor[j] > vetor[menor]){
                        maior = j; 
                        aux = vetor[menor];
                        vetor[menor] = vetor[maior];
                        vetor[maior] = aux;
                    }
                } else if (vetor[i] % 3 == 0) {
                    maior = j; 
                    aux = vetor[menor];
                    vetor[menor] = vetor[maior];
                    vetor[maior] = aux;
                } else if(vetor[i] % 3 != 0 && vetor[j] % 3 != 0) {
                    if(vetor[i] > vetor[j]){
                        menor = j;
                        aux = vetor[menor];
                        vetor[menor] = vetor[j];
                        vetor[j] = aux;
                    }
                }

            }
        }

        return vetor;
    }

    public static boolean verificaFim(String in){
        if(in.charAt(0) == '0' || in.charAt(2) == '0'){
            return false;
        }
        return true;
    }
 
}
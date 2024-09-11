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
            in = sc.nextLine();
        }
    }

    public static boolean verificaFim(String in){
        if(in.charAt(0) == '0' || in.charAt(2) == '0'){
            return false;
        }
        return true;
    }
 
}
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
        int N = Integer.parseInt(in.readLine());

        imprime(N);

        in.close();
    }

    public static void imprime(int N){
        for(int i = 1; i <= N; i++){
            if(i % 2 == 0){
                System.out.println(i+"^2 = " + (int)Math.pow(i,2));
            }
        }
    }
 
}
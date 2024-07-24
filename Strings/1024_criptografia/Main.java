import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(sc.readLine());
        String[] string = new String[N];

        for(int i = 0; i < string.length; i++){
            string[i] = sc.readLine();
        }

        sc.close();
    }
 
}
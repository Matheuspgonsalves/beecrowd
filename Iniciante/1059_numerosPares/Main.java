import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int i = 1;

        while(i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

        sc.close();
    }
 
}
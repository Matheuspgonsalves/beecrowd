import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();

        imprime(x);

        sc.close();
    }

    public static void imprime(int n){
        int i = 1;
        while(i <= n){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
 
}
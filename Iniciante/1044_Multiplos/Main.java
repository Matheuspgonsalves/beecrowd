import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int A, B, resto = 0;
        
        A = sc.nextInt();
        B = sc.nextInt();
        
        if(A >= B){
            resto = A % B;
        }
        else {
            resto = B % A;
        }

        if(resto == 0){
            System.out.println("Sao multiplos\n");
        } else {
            System.out.println("Nao sao Multiplos\n");
        }
        
        sc.close();
    }
 
}
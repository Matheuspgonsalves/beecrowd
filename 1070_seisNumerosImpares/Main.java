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
        int i = n, count = 0;
        while(count < 6){
            if(i % 2 != 0){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arrayX = new int[N];

        for(int i = 0; i < N; i++){
            arrayX[i] = sc.nextInt();
        }

        int in = in(arrayX);
        int out = out(arrayX);

        imprime(in, out);

        sc.close();
    }

    

    public static int in(int[] X){
        int count = 0;
        for(int i = 0; i < X.length; i++){
            if(X[i] >= 10 && X[i] <= 20){
                count++;
            }
        }
        return count;
    }

    public static int out(int[] X){
        int count = 0;
        for(int i = 0; i < X.length; i++){
            if(X[i] < 10 || X[i] > 20){
                count++;
            }
        }
        return count;
    }

    public static void imprime(int X, int Y){
        System.out.println(X + " in");
        System.out.println(Y + " out");
    }
 
}
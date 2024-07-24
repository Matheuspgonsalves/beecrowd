import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        float [] p = new float[6];
        int count = 0;

        for(int i = 0; i < 6; i++){
            p[i] = sc.nextFloat();
            if(p[i] > 0){
                count++;
            }
        }
        System.out.println(count + " valores positivos");

        sc.close();
    }
 
}
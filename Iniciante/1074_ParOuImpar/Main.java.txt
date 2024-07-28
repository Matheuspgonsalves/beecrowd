import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(sc.readLine());

        int[] array = new int[N];

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(sc.readLine());
        }
        
        int c = 0;
        while(c < array.length){
            if((array[c] > 0) && (array[c] % 2 == 0)){
                System.out.println("EVEN POSITIVE");
            } else if ((array[c] > 0) && (array[c] % 2 != 0)){
                System.out.println("ODD POSITIVE");
            } else if((array[c] < 0) && (array[c] % 2 == 0)){
                System.out.println("EVEN NEGATIVE");
            } else if((array[c] < 0) && (array[c] % 2 != 0)){
                System.out.println("ODD NEGATIVE");
            } else {
                System.out.println("NULL");
            }
            c++;
        }

        
        
        sc.close();
    }

}
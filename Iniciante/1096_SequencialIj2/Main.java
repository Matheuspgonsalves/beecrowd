import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int i = 1, j = 7;
        
        while(j >= 5 && i <= 9){
            System.out.println("I="+i+" J="+j);
            j--;
            if(j < 5){
                i+=2;
                j = 7;
            }
        }
    }
 
}
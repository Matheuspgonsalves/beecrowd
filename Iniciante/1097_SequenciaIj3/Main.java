import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int i = 1, j = 7, aux = 5;
        
        while(i <= 9){
            System.out.println("I="+i+" J="+j);
            j--;
            if(j < aux){
                i+=2;
                j+=5;
                aux+=2;
            }
        }
    }
}
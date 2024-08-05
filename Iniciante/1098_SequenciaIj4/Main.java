import java.io.IOException;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int j = 1, c = 1, aux = 4;
        double i = 0;

        while(i < 3){
            if(i == (int)i){
                System.out.println("I="+(int)i+" J="+j);
            } else {
                System.out.println("I="+i+" J="+(double)(j+i));
            }
            j++;
            if(j >= aux){
                j = 1;
                i += 0.2;
            }
        }
        
    }
 
}
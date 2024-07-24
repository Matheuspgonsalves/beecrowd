import java.io.IOException;
import java.util.Scanner; 
import java.lang.Math.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
 
        double A, B, C, auxB = 0, delta = 0, bhaskara1 = 0, bhaskara2 = 0;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        if( (A <= 0 && C <= 0) || (B <=0) || (A == 0) || (C == 0) || (Math.pow(B,2)) < (4*A*C) ) {
            
            System.out.println("Impossivel calcular");
            
        } else {
            
            auxB = Math.pow(B, 2);
        
            delta = Math.sqrt(auxB - (4*A*C));
            bhaskara1 = (-(B) + delta)/(2*A);
            bhaskara2 = (-(B) - delta)/(2*A);
            
            System.out.printf("R1 = %.5f\n", bhaskara1);
            System.out.printf("R2 = %.5f\n", bhaskara2);
        }
        
        
        
        sc.close();
    }
 
}
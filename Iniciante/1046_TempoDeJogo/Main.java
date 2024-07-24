import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int A, B;
        
        A = sc.nextInt();
        B = sc.nextInt();
        
        if(A == B){
            System.out.println("O JOGO DUROU 24 HORA(S)\n");
        } else if(A < B){
            System.out.println("O JOGO DUROU " + (B-A) + " HORA(S)\n");
        } else if(A > B){
            int horas = 0;
            for(int i = A+1; i <= 24; i++){
                horas++;
            }
            System.out.println("O JOGO DUROU " + (horas+B) + " HORA(S)\n");
        }
        
        sc.close();
    }
 
}
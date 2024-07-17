import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        double A, B, C, aux;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        

        if((A >= B && B >= C) || (A >= C && C >= B)){
            if(B >= C){
                
            }
            else if (C >= B){
                aux = C;
                C = B;
                B = aux;
            }
        }
        else if((B >= A && A >= C) || (B >= C && C >= A)){
            if(A >= C){
                aux = B;
                B = A;
                A = aux;
            }
            else if(C >= A){
                aux = B;
                B = C;
                C = A;
                A = aux;
            }
        }
        else if((C >= A && A >= B) || (C >= B && B >= A)){
            if(A >= B){
                aux = C;
                C = B;
                B = A;
                A = aux;
            }
            else if(B >= A){
                aux = C;
                C = A;
                A = aux;
            }
        } else if (A == B && B == C){

        }

        System.out.println(A + " " + B + " " + C);
        
        if(A >= (B+C) || B >= (A+C) || C >= (A+B)){
            System.out.println("NAO FORMA TRIANGULO");
        } 
        if(Math.pow(A,2) == (Math.pow(B,2) + Math.pow(C,2))){
            System.out.println("TRIANGULO RETANGULO");
        }
        if(Math.pow(A,2) > Math.pow(B,2) + Math.pow(C,2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if( (Math.pow(A,2)) < (Math.pow(B,2) + Math.pow(C,2))){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(A == B && B == C){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if((A == B && B != C) || (A == C && C != B) || (C == B && B != A)){
            System.out.println("TRIANGULO ISOCELES");
        }
       
        sc.close();
    }
 
}
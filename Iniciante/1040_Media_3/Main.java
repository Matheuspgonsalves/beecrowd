import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        float n1, n2, n3, n4, exame , media = 0;
        
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();
        
        media = (float)((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1.0) )/10;
        
        System.out.printf("Media: %.1f\n", media);
        
        if(media >= 7){
            System.out.println("Aluno aprovado.");
        } else if(media < 5){
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            exame = sc.nextFloat();
            System.out.println("Nota do exame: " + exame);
            
            media += exame;
            media /= 2;
        
            if(media >= 5){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            
            System.out.println("Media final: " +  media);

        }
        
        sc.close();
    }
 
}
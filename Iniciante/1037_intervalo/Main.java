import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        float valor;
        
        valor = sc.nextFloat();
        
        if(valor < 0 || valor > 100){
            System.out.println("Fora de intervalo");
        }
        if (valor >= 0 && valor <= 25){
            System.out.println("Intervalo [0,25]");
        }
        if (valor > 25 && valor <= 50){
            System.out.println("Intervalo (25,50]");
        }
        if (valor > 50 && valor <= 75){
            System.out.println("Intervalo (50,75]");
        }
        if (valor > 75 && valor <= 100){
            System.out.println("Intervalo (75,100]");
        }
        
        sc.close();
    }
 
}
import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
 
        int N, hora = 0, minuto = 0, segundo = 0, calculo = 0, resto;
        
        N = sc.nextInt();
        
        if(N >= 3600){
            calculo = N / 3600;
            resto = N % 3600;
            N = resto;
            hora = calculo;
        }
        
        if(N >= 60 ){
            calculo = N / 60;
            resto = N % 60;
            N = resto;
            minuto = calculo;
        }
        
        if(N >= 0 ){
            segundo = N;
        }
        
        System.out.println(hora + ":" + minuto + ":" + segundo);
        
        sc.close();
    }
 
}
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N, calculo = 0, resto = 0, aux = 0;
        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;
        
        N = sc.nextInt();
        
        while(!(N > 0 && N < 1000000)){
            N = sc.nextInt();
        }
        
        if(N >= 100){
            calculo = N / 100;
            resto = N % 100;
            nota100 = calculo;
        }
        else {
            resto = N;
        }
        
        if(resto >= 50){
            aux = resto;
            calculo = aux / 50;
            resto = aux % 50;
            nota50 = calculo;
        }
        
        if(resto >= 20){
            aux = resto;
            calculo = aux / 20;
            resto = aux % 20;
            nota20 = calculo;
        }
        
        if(resto >= 10){
            aux = resto;
            calculo = aux / 10;
            resto = aux % 10;
            nota10 = calculo;
        }
        
        if(resto >= 5){
            aux = resto;
            calculo = aux / 5;
            resto = aux % 5;
            nota5 = calculo;
        }
        
        if(resto >= 2){
            aux = resto;
            calculo = aux / 2;
            resto = aux % 2;
            nota2 = calculo;
        }
        
        if(resto >= 1){
            aux = resto;
            calculo = aux / 1;
            resto = aux % 1;
            nota1 = calculo;
        }
        
        System.out.printf("%d\n",N);
        System.out.printf("%d nota(s) de R$ 100,00\n",nota100);
        System.out.printf("%d nota(s) de R$ 50,00\n",nota50);
        System.out.printf("%d nota(s) de R$ 20,00\n",nota20);
        System.out.printf("%d nota(s) de R$ 10,00\n",nota10);
        System.out.printf("%d nota(s) de R$ 5,00\n",nota5);
        System.out.printf("%d nota(s) de R$ 2,00\n",nota2);
        System.out.printf("%d nota(s) de R$ 1,00\n",nota1);
        
        sc.close();
    }
 
}
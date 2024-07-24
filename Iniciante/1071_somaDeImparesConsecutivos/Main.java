import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        int somaImpar = soma(x, y);

        imprime(somaImpar);

        sc.close();
    }

    public static int soma(int x, int y){
        int aux;
        if(x < y) {//ordenando os valores
            aux = y;
            y = x;
            x = aux;
        }

        int soma = 0;

        for(int i = x-1; i > y; i--){//somando os impares
            if(i % 2 != 0){
                soma += i;
            }
        }

        return soma;
    }

    public static void imprime(int s){
        System.out.println(s);
    }
 
}
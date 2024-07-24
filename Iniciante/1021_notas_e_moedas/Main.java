import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;
        int calculo = 0, auxConversor = 0;
        int moeda50 = 0, moeda25 = 0, moeda10 = 0, moeda5 = 0, moeda1 = 0;
        float N, auxCalculo = 0;
        
        N = sc.nextFloat();
        auxConversor = (int) N;
        
        if(auxConversor >= 100){
            calculo = (int) auxConversor / 100;
            auxConversor =  auxConversor % 100;
            nota100 = calculo;
        }
        
        if(auxConversor >= 50){
            calculo = auxConversor / 50;
            auxConversor = auxConversor % 50;
            nota50 = calculo;
        }
        
        if(auxConversor >= 20){
            calculo = auxConversor / 20;
            auxConversor = auxConversor % 20;
            nota20 = calculo;
        }
        
        if(auxConversor >= 10){
            calculo = auxConversor / 10;
            auxConversor = auxConversor % 10;
            nota10 = calculo;
        }
        
        if(auxConversor >= 5){
            calculo = auxConversor / 5;
            auxConversor = auxConversor % 5;
            nota5 = calculo;
        }
        
        if(auxConversor >= 2){
            calculo = auxConversor / 2;
            auxConversor = auxConversor % 2;
            nota2 = calculo;
        }
        
        if(auxConversor >= 1){
            calculo = auxConversor / 1;
            auxConversor = auxConversor % 1;
            nota1 = calculo;
        }
        
        auxCalculo = ((N - ((int) N)));
        auxConversor = Math.round(auxCalculo * 100);
        
        
        if(auxConversor >= 50){
            calculo = auxConversor / 50;
            auxConversor = auxConversor % 50;
            moeda50 = calculo;
        }
        
        if(auxConversor >= 25){
            calculo = auxConversor / 25;
            auxConversor = auxConversor % 25;
            moeda25 = calculo;
        }
        
        if(auxConversor >= 10){
            calculo = auxConversor / 10;
            auxConversor = auxConversor % 10;
            moeda10 = calculo;
        }
        
        if(auxConversor >= 5){
            calculo = auxConversor / 5;
            auxConversor = auxConversor % 5;
            moeda5 = calculo;
        }
        
        if(auxConversor >= 1){
            calculo = auxConversor / 1;
            auxConversor = auxConversor % 1;
            moeda1 = calculo;
        }
        
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(nota1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1 + " moeda(s) de R$ 0.01");
        
        
        sc.close();
    }
 
}
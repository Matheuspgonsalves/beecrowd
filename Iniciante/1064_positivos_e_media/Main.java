import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException { //Funcao principal
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        double[] numeros = new double[6];//Array de double para receber os valores

        for(int i = 0; i < numeros.length; i++){//Loop para armazenar os valores no array
            numeros[i] = Double.parseDouble(sc.readLine());
        }

        int positivos = positivos(numeros);//recebe a quantidade inteira de numeros positivos
        double media = media(numeros);//recebe a media dos numeros positivos

        //Saida para usuario
        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f\n", media);

        sc.close();
    }

    public static int positivos(double[] n){//Funcao para retornar a quantidade de valores positivos
        
        int count = 0, i = 0;
        while(i < n.length){
            if(n[i] > 0){
                count++;
            }
            i++;
        }
        return  count;
    }

    public static double media(double[] n){//Funcao para retornar a media dos valores positivos
        
        double soma = 0;
        int count = 0;
        
        for(int i = 0; i < n.length; i++){
            if(n[i] > 0){
                soma += n[i];
                count++;
            }
        }
        soma /= count;
        return soma;
    }

 
}
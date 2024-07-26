import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        //Declaracao e leitura da variavel
        int N = Integer.parseInt(sc.readLine());
        //Declaracao do ArrayList
        ArrayList<String> string = new ArrayList<String>();

        /*Leitura do array list colocando um
         caractere de linha no final */
        for(int i = 0; i < N; i++){
            string.add(sc.readLine() + "\n");
        }
        
        //Declarando array de String
        String[] linhas = new String[N];
        
        /* Convertendo arrayList para array de String
         * para facilitar a conversao da criptografia
         */
        for(int i = 0; i < N; i++){
            linhas[i] = string.get(i);
        }

        /* Declaracao da variavel count e retorno da funcao que vai contar
         * o espaco total do array de String e o espaco ocupado por cada
         * caracter dentro das Strings
         */
        int count = espacoTotalString(linhas);

        //Declaracao de array de int
        int[] arrayDeCaracter = new int[count];

        /* array recebe um array de string convertido em caracteres 
         * respectivamente em forma de numeros da tabela ASCII
        */
        arrayDeCaracter = convertStringToInt(linhas, count);

        for(int i = 0; i < arrayDeCaracter.length; i++){
            System.out.println((char)arrayDeCaracter[i]);
        }
        
        sc.close();
    } 

    /* Metodo para retornar um array de String convertido em array de Int */
    public static int[] convertStringToInt(String[] tempLinhas, int n){
        int[] array = new int[n];
        for(int i = 0; i < tempLinhas.length; i++){
            for(int j = 0; j < tempLinhas[i].length(); j++){
                array[i] = (int)tempLinhas[i].charAt(j);
            }
        }
        return array;
    }

    /* Funcao que retorna o espaco total  do array de String
     * somado com o espaco total ocupado por cada caracter
    */
    public static int espacoTotalString(String[] temp){
        int tempCount = 0;
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[i].length(); j++){
                tempCount++;
            }
        }
        return tempCount;
    }
}
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        //Declaracao e leitura da variavel
        int N = Integer.parseInt(sc.readLine());
        //Declaracao do ArrayList
        String string[] = new String[N];

        /*Leitura do array list colocando um
         caractere de linha no final */
        for(int i = 0; i < N; i++){
            string[i] = (sc.readLine());
        }

        /* Iteracao para enviar cada indice da String
         * ao metodo da primeira criptografia
         */
        for(int i = 0; i < string.length; i++){
            string[i] = encriptografaPrimeiraVez(string[i]);
        }

        /* Iteracao para enviar cada indice do novo array de String
         * ao metodo de reversao
         */
        for(int i = 0; i < string.length; i++){
            string[i] = reverteString(string[i]);
        }

        /* Iteracao para encriptografar a String pela
         * segunda vez
         */
        for(int i = 0; i < string.length; i++){
            string[i] = encriptografaSegundaVez(string[i]);
        }

        imprimir(string);
        
        sc.close();
    }

    /* Metodo para criptografar a String recebida
     */
    public static String encriptografaPrimeiraVez(String temp){
        char[] charArray = temp.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if((charArray[i] >= 65 && charArray[i] <= 90) || (charArray[i] >= 97 && charArray[i] <= 122)){
                charArray[i] += 3;
            }
        }
        return new String(charArray);
    }

    /* Metodo que recebe o indice do array de string e retorna
     * a string do indice escrita ao contrario
     */
    public static String reverteString (String inverte){
        char[] charArray = inverte.toCharArray();
        int lenArray = charArray.length-1;
        for(int i = 0; i <= lenArray; i++){
            charArray[i] = inverte.charAt(lenArray - i);
        }

        return new String(charArray);
    }

    /* Metodo que recebe o indice do novo array de String
     * e retorna a ultima criptografia
     */
    public static String encriptografaSegundaVez(String temp){
        char[] arrayChar = temp.toCharArray();
        for(int i = arrayChar.length/2 ; i < arrayChar.length; i++){
            arrayChar[i] -= 1;
        }
        return new String(arrayChar);
    }

    /* Metodo para imprimir a String criptografada
     */
    public static void imprimir(String[] imprime){
        for(int i = 0; i < imprime.length; i++){
            System.out.println(imprime[i]);
        }
    }
}
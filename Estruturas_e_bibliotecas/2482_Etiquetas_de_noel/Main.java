import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        /* Leitura e alocação dos dados*/ 
        int n = Integer.parseInt(in.readLine());

        String vetorIdioma[] = new String[n * 2];

        for(int i = 0; i < vetorIdioma.length; i++){
            vetorIdioma[i] = in.readLine();
        }

        int m = Integer.parseInt(in.readLine());

        String vetorNome[] = new String[m * 2];

        for(int i = 0; i < vetorNome.length; i++){
            vetorNome[i] = in.readLine();
        }
        /*Fim Leitura e alocação dos dados*/

        String[] res = resFinal(vetorIdioma, vetorNome);

        for (int i = 0; i < res.length; i += 2) {
            System.out.println(res[i]);
            if (i + 1 < res.length) {
                System.out.println(res[i + 1]);
            }
            System.out.println();
        }

        in.close();
    }

    public static String[] resFinal(String[] idioma, String[] nome_e_idioma){
        
        String newString[] = new String[nome_e_idioma.length];
        int count = 0;

        for(int i = 1; i < nome_e_idioma.length; i+=2){
            for(int j = 0; j < idioma.length; j+=2){
                if(compareString(idioma[j], nome_e_idioma[i])){
                    newString[count] = nome_e_idioma[i - 1];
                    newString[count+1] = idioma[j+1];
                    count+=2;
                }
            }
        }

        return newString;
    }

    public static boolean compareString(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
 
}
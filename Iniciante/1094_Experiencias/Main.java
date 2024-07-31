import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(in.readLine());

        String cobaias = "";
        int rato = 0, sapo = 0, coelho = 0;

        for(int i = 0; i < N; i++){
            cobaias = in.readLine();
            String[] auxCobaia = cobaias.split(" ");
            if(auxCobaia[1].charAt(0) == 'R'){
                rato += Integer.parseInt(auxCobaia[0]);
            }
            if(auxCobaia[1].charAt(0) == 'S'){
                sapo += Integer.parseInt(auxCobaia[0]);
            }
            if(auxCobaia[1].charAt(0) == 'C'){
                coelho += Integer.parseInt(auxCobaia[0]);
            }
        }

        imprimir(rato, sapo, coelho);

        in.close();
    }

    public static void imprimir(int r, int s, int c){
        double percC = (double)(c*100)/(r+s+c), percR = (double)(r*100)/(r+s+c), percS = (double)(s*100)/(r+s+c);
        System.out.println("Total: " + (r+s+c) + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percC);
        System.out.printf("Percentual de ratos: %.2f %%\n", percR);
        System.out.printf("Percentual de sapos: %.2f %%\n", percS);
    }
}
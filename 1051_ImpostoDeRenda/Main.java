import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        float imposto = 0;
        float valor;
        String valorString = sc.readLine();
        
        valor = Float.parseFloat(valorString);
        
        if(valor >= 0 && valor <= 2000){
            System.out.println("Isento");
        } else {
            if(valor > 2000 && valor <= 3000){
            imposto = (((valor - 2000)/100)*8);
            } 
            if(valor > 3000 && valor <= 4500){
                imposto += (((valor - 3000)/100)*18)+80;
            } 
            if(valor > 4500){
                imposto += (((valor - 4500)/100)*28)+350;
            }
            System.out.printf("R$ %.2f\n", imposto);
        }
        sc.close();
    }
}
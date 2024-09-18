import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String in = "";

        Pilha pilha;

        int n = sc.nextInt();//Tamanho do vetor

        pilha = new Pilha(n);//Inicializando tamanho da pilha

        sc.nextLine();//Consumindo buffer

        for(int i = 0; i < n; i++){
            in = sc.nextLine();
            
            String partes[] = in.split(" ");

            //Se o numero de partes for maior que 1, a operacao vai ser PUSH
            if(partes.length > 1) { 
                int grau = Integer.parseInt(partes[1]);
                try {
                    pilha.inserirInicio(grau);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else {
                switch (partes[0]) {
                    case "POP":
                        try {
                            pilha.removerInicio();
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                        break;
                    case "MIN":
                        try {
                            pilha.menorValor();
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                        break;
                    default:
                        break;
                }
                
            }
        }
        sc.close();
    }

}
 


class Pilha{
    int[] array;
    int n;

    Pilha(int tam){
        array = new int[tam];
        n = 0;
    }

    public void inserirInicio(int x) throws Exception{
        if(n >= array.length)
        throw new Exception("Pilha Cheia");

        for(int i = n; i > 0; i--){
            array[i] = array[i - 1];
        }

        array[0] = x;
        n++;
    }

    public int removerInicio() throws Exception{
        if(n == 0)
            throw new Exception("EMPTY");
        
        int resp = array[0];
        n--;

        for(int i = 0; i < n; i++){
            array[i] = array[i + 1];
        }

        return resp;
    }

    public void menorValor() throws Exception{//Consulta o menor valor do array
        if(n == 0)
            throw new Exception("EMPTY");

        int resp = array[0];
        for(int i = 1; i < n; i++){
            if(array[i] < resp){
                resp = array[i];
            }
        }
        
        System.out.println(resp);
    }
}
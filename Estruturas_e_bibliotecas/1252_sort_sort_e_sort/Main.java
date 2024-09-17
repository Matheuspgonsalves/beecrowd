import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Lista lista;
        
        String in = sc.nextLine();
        
        while(verificaFim(in)){
            String[] partes = in.split(" ");

            int n = Integer.parseInt(partes[0]);
            int m = Integer.parseInt(partes[1]);

            lista = new Lista(n);

            int num;

            int[] vetorNums = new int[n];

            for(int i = 0; i < vetorNums.length; i++){
                num = sc.nextInt();
                sc.nextLine();

                if(num % 3 == 0){
                    lista.inserirPrioridade(num);
                } else if(num % 3 > 0) {
                    
                }
            }
    
            in = sc.nextLine();
        }
    }

    public static boolean verificaFim(String in){
        if(in.charAt(0) == '0' || in.charAt(2) == '0'){
            return false;
        }
        return true;
    }
 
}

class Lista {
    int[] array;
    int n;

    Lista(int tamanho){
        array = new int[tamanho];
        n = 0;
    }

    public void inserirPrioridade(int x) throws Exception{
        if (n >= array.length)
        throw new Exception("Erro! Tamanho ultrapassado");

        if(x % 2 != 0){
            
            for(int i = n; i > 0; i--){
                if(x > array[i-1]){
                    array[i] = array[i-1];
                } else {
                    array[i] = array[i-1];
                }
            }
        } else {
            for(int i = n; i > 1; i--){
                if(array[i - 1] % 2 == 0 && x < array[i - 1]){

                }
            }
        }

        
        n++;

    }

    public void inserirPrioridadeEntreImparPar(int x) throws Exception{
        if (n >= array.length)
        throw new Exception("Erro! Tamanho ultrapassado");

        if(x % 2 != 0){
            for(int i = n; i > 0; i--){
                array[i] = array[i-1];
            }
        } else {
            for(int i = n; i > 1; i--){
                array[i] = array[i-1];
            }
        }
        

        array[0] = x;
        n++;

    }


}
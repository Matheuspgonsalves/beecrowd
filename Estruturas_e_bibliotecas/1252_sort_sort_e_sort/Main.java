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

                if(num % 2 != 0 && num % m == 0){
                    lista.inserirImparPrioridade(num);
                } else if(num % 2 == 0 && num % m == 0){
                    lista.inserirParPrioridade(num);
                } else {

                }
            }

            lista.mostrar();
            sc.nextLine();
            in = sc.nextLine();
        }
    }

    public static boolean verificaFim(String in) {
        String[] partes = in.split(" ");
        if (partes.length < 2) {
            return false;
        }
        return !(partes[0].equals("0") && partes[1].equals("0"));
    }
 
}

class Lista{
    int[] array;
    int n;
    int prioridadeImpar;
    int prioridadePar;

    Lista(int tam){
        array = new int[tam];
        n = 0;
        prioridadeImpar = 0;
        prioridadePar = 0;
    }

    public void inserirImparPrioridade(int x) throws Exception{
        if(n >= array.length)
        throw new Exception("Erro!");

        for(int i = n; i > 0; i--){
            array[i] = array[i - 1];
        }
        
        if(x > array[0]){
            array[0] = x;
        } else {
            array[1] = x;
        }
        
        prioridadeImpar++;
        n++;
    }

    public void inserirParPrioridade(int x) throws Exception{
        if(n >= array.length)
        throw new Exception("Erro!");

        for(int i = n; i > prioridadeImpar; i--){
            array[i] = array[i - 1];
        }

        if(x < array[prioridadeImpar]){
            array[prioridadeImpar] = x;
        } else {
            array[prioridadeImpar + 1] = x;
        }

        prioridadePar++;
        n++;
    }

    public void inserir(int x) throws Exception{
        if(n >= array.length)
        throw new Exception("Erro!");

        for(int i = n; i > (prioridadeImpar + prioridadePar); i--){
            array[i] = array[i - 1];
        }

        array[prioridadeImpar + prioridadePar] = x;

        prioridadePar++;
        n++;
    }

    public void mostrar(){
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }


}
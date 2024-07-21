import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String di, df, hi, hf;

        di = sc.nextLine();
        hi = sc.nextLine();
        df = sc.nextLine();
        hf = sc.nextLine();

        int dataInicio = transforma(di, hi);
        int dataFim = transforma(df, hf);
        int resp = dataFim - dataInicio;

        imprime(resp);

        sc.close();
    }

    public static int transforma(String dia, String hora){
        String tempDia[] = dia.split(" ");
        int dias = Integer.parseInt(tempDia[1]);
        String tempHora[] = hora.split(" : ");
        int horas = Integer.parseInt(tempHora[0]);
        int min = Integer.parseInt(tempHora[1]);
        int sec = Integer.parseInt(tempHora[2]);

        horas = horas + (dias*24);
        min = min + (horas*60);
        sec = sec + (min*60);

        return sec;
    }

    public static void imprime(int sec){
        int dias = sec / 86400;
        int horas = (sec % 86400) / 3600;
        int minutos = ((sec % 86400) % 3600)/60;
        sec = sec % 60;

        System.out.println(dias + "dia(s)");
        System.out.println(horas + "hora(s)");
        System.out.println(minutos + "minuto(s)");
        System.out.println(sec + "segundo(s)");
    }
 
}
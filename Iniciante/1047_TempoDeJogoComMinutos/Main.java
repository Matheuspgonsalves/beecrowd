import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int horaInicio, horaFim, minutoInicio, minutoFim, minutosTotais = 0;
        int horasTotais = 0;
        
        horaInicio = sc.nextInt();
        minutoInicio = sc.nextInt();
        horaFim = sc.nextInt();
        minutoFim = sc.nextInt();

        //calculo os minutos 
        if(minutoInicio <= minutoFim){
            minutosTotais = minutoInicio - minutoFim;
            //Transforma os minutos em um numero valido
            minutosTotais = minutosTotais < 0 ? -(minutosTotais) : minutosTotais;        
        } else {
            minutosTotais = minutoInicio - minutoFim;
        }

        //calcula as horas
        if(horaInicio < horaFim){
            horasTotais = horaFim - horaInicio;
        } else if(horaInicio > horaFim){
            for(int i = horaInicio+1; i <= 24; i++){
                horasTotais++;
            }
            horasTotais += horaFim;
        } else {
            if(minutoInicio < minutoFim){
                horasTotais = 0;
            } else {
                horasTotais = 24;
            }
        }
        
        //Saida para o usuario
        if(minutoInicio > minutoFim){
            System.out.println("O JOGO DUROU " + (horasTotais-1) + " HORA(S) E " + (60-minutosTotais) + " MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + horasTotais + " HORA(S) E " + minutosTotais + " MINUTO(S)");
        }

        sc.close();
    }
 
}
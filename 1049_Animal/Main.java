import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        String tipoAnimal;
        
        tipoAnimal = sc.readLine();
        
        if(tipoAnimal.equals("vertebrado")){
            tipoAnimal = sc.readLine();
            if(tipoAnimal.equals("ave")){
                tipoAnimal = sc.readLine();
                if(tipoAnimal.equals("carnivoro")){
                    System.out.println("aguia");
                } 
                else {
                    System.out.println("pomba");
                }
            } 
            else{
                tipoAnimal = sc.readLine();
                if(tipoAnimal.equals("onivoro")){
                    System.out.println("homem");
                }
                else {
                    System.out.println("vaca");
                }
            }
        } 
        else {
            
            tipoAnimal = sc.readLine();
            if(tipoAnimal.equals("inseto")){
                tipoAnimal = sc.readLine();
                if(tipoAnimal.equals("hematofago")){
                    System.out.println("pulga");
                }
                else{
                    System.out.println("lagarta");
                }
            }
            else {
                tipoAnimal = sc.readLine();
                if(tipoAnimal.equals("hematofago")){
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
        sc.close();
    }
 
}
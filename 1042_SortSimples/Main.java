    import java.io.IOException;
    import java.util.Scanner;
    
    public class Main {
     
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
                int x, y, z;
                
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                
                if((x <= y && y <= z) || (x <= z && z <= y)){
                    if(y <= z){
                        System.out.printf("%d\n%d\n%d\n", x, y, z);
                    }
                    else if (z <= y){
                        System.out.printf("%d\n%d\n%d\n", x, z, y);
                    }
                }
                else if((y <= x && x <= z) || (y <= z && z <= x)){
                    if(x <= z){
                        System.out.printf("%d\n%d\n%d\n", y, x, z);
                    }
                    else if(z <= x){
                        System.out.printf("%d\n%d\n%d\n", y, z, x);
                    }
                }
                else if((z <= x && x <= y) || (z <= y && y <= x)){
                    if(x < y){
                        System.out.printf("%d\n%d\n%d\n", z, x, y);
                    }
                    else if(y < x){
                        System.out.printf("%d\n%d\n%d\n", z, y, x);
                    }
                } else if (x == y && y == z){
                    System.out.printf("%d\n%d\n%d\n", z, y, x);
                }
                
                System.out.printf("\n%d\n%d\n%d\n", x, y, z);
    
            sc.close();
        }
     
    }
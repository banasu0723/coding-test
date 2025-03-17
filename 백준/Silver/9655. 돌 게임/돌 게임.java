import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int winner = 0;
        while(N!=0){
            if(N>3){
                N-=3;
            }else{
                N--;
            }
            if(winner==1){
                winner = 0;
            }else{
                winner = 1;
            }
        }
        if(winner==0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}
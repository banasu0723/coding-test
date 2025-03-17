import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 0, num2 = 1, result = 1;
        for(int i=0; i<n-1; i++){
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        if(n==0){
            System.out.println(0);
        }else{
            System.out.println(result);
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int turnCount = Integer.parseInt(br.readLine());
        // 짝수일때 찬영 승, 홀수일때 상근 승
        if(turnCount %2==0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}
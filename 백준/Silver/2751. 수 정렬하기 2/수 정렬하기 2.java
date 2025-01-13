import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); // StringBuilder 선언, 시간초과 방지

        int N = sc.nextInt();
        ArrayList<Integer> number = new ArrayList<>();

        for(int i=0; i<N; i++){
            number.add(sc.nextInt());
        }


        Collections.sort(number);

        for(int value : number){
            sb.append(value).append('\n');
        }

        System.out.println(sb);

    }
}
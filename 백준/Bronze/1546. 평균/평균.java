import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float num, sum = 0;
        float avg;
        float[] score = new float[N];
        score[0] = sc.nextInt();
        float max = score[0];
        for(int i=1; i<N; i++){
            score[i] = sc.nextInt();
            if(max<score[i]){
                max = score[i];
            }
        }
        for(int i=0; i<N; i++){
            score[i] = score[i]/max*100;
            sum += score[i];
        }

        System.out.println(sum/N);
        sc.close();

    }
}
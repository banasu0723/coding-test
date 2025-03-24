import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 0부터 N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 수
// 점화식 이용 : dp[N][K] = dp[N-1][K] + dp[N][K-1]
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int dp[][] = new int[N+1][K+1];

        for(int i=0; i<=N; i++){
            dp[i][0] = 0;
            dp[i][1] = 1;
        }

        for(int i=0; i<=K; i++){
            dp[1][i] = i;
        }

        for(int i=2; i<=N; i++){
            for(int j=2; j<=K; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                dp[i][j] %= 1000000000;
            }
        }

        System.out.println(dp[N][K]);

    }
}
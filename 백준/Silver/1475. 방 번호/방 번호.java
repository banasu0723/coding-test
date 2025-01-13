import java.util.Scanner;
// 1~9까지 갯수 각자 구한뒤에 갯수가 0이 아닌 수들 1씩 빼주고 answer++ 해주기
// 6으로 묶은 다음에 6만 2개씩 처리
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num, answer = 0, six = 0;
        int cnt = 0;
        int[] room = new int[]{0,0,0,0,0,0,0,0,0}; // 0~8, 9는 6이랑 똑같이 생각

        for(;;){
            num = N % 10;
            if(num==9){
                room[6]++;
            }else{
                room[num]++;
            }
            if(N<10){
                break;
            }
            N /= 10;
        }

        six = room[6] % 2;
        if(six==0){
            six = room[6]/2;
        }else{
            six = room[6]/2 + 1;
        }
        room[6] = six;

        for(;;){
            for(int i=0; i<9; i++){
                if(room[i] == 0){
                    cnt++;
                }else{
                    room[i]--;
                }
            }
            if(cnt==9){
                break;
            }else{
                answer++;
                cnt = 0;
            }
        }


        System.out.println(answer);
        sc.close();

    }
}
/*
996900

2

111234966

3

1122

2
 */
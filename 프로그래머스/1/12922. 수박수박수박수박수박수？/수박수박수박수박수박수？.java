class Solution {
    public String solution(int n) {
        String answer = "";
        String watermelon = "수박";
        int num = 0;
        for(int i=0; i<n; i++){
            answer += watermelon.charAt(num);
            if(num==0){
                num=1;
            }else{
                num = 0;
            }
        }
        return answer;
    }
}
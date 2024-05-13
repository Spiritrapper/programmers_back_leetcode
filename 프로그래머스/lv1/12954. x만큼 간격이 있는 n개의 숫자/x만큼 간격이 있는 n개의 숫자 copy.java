import java.util.Scanner;
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for (int i =0; i < n; i++){
            answer[i] = (long)x*(i+1);
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        Solution s = new Solution();
        long[] answer = s.solution(x,n);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        
    }
    }
}
import java.util.Scanner;
class Solution {
    public String solution(int num) {
        String answer = "";
        if (num % 2 ==0 ){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        Solution s = new Solution();
        String answer = s.solution(num);
        System.out.println(answer);
    }
}
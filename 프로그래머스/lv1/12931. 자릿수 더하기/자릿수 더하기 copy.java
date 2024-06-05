import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            int digit = n % 10;
            answer += digit;
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Solution s = new Solution();
        answer = s.solution(n);
        System.out.println("각 자리수의 합: " + answer);
    }
}
public class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int num = left; num <= right; num++) {
            int divisorCount = countDivisors(num);
            if (divisorCount % 2 == 0) {
                sum += num;
            } else {
                sum -= num;
            }
        }
        return sum;
    }

    // 약수의 개수를 세는 함수
    private int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
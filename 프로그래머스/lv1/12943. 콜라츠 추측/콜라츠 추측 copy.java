class Solution {
    public int solution(int num) {
        long n = (long) num; // num을 long으로 형변환하여 오버플로우를 방지합니다.
        int count = 0; // 반복 횟수를 저장하는 변수

        while (n != 1) { // n이 1이 될 때까지 반복합니다.
            if (count >= 500) { // 500번 이상 반복하면 -1을 반환합니다.
                return -1;
            }

            if (n % 2 == 0) { // 짝수인 경우
                n /= 2;
            } else { // 홀수인 경우
                n = n * 3 + 1;
            }

            count++;
        }

        return count; // 반복 횟수를 반환합니다.
    }
}
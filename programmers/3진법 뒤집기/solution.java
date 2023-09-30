// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/68935

class Solution {
     public static int solution(int n) {
        StringBuilder ternary = new StringBuilder();
        
        // 3진법으로 변환
        while (n > 0) {
            int remainder = n % 3;
            n = n / 3;
            ternary.append(remainder);
        }
        
        int reversedTernary = 0;
        int powerOfThree = 1;
        
        // 3진법을 뒤집어서 10진법으로 변환
        for (int i = ternary.length() - 1; i >= 0; i--) {
            reversedTernary += (ternary.charAt(i) - '0') * powerOfThree;
            powerOfThree *= 3;
        }
        
        return reversedTernary;
    }

    public static void main(String[] args) {
        int result1 = solution(45);
        int result2 = solution(125);
        
        System.out.println(result1); // 출력: 7
        System.out.println(result2); // 출력: 229
    }
}
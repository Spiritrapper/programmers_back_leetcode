class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] check = new boolean[10]; // 0~9까지의 숫자를 체크하는 배열
        
        // 주어진 배열에 있는 숫자들을 체크
        for (int num : numbers) {
            check[num] = true;
        }
        
        // 빠진 숫자의 합 계산
        for (int i = 1; i <= 9; i++) {
            if (!check[i]) {
                answer += i;
            }
        }
        
        return answer;
    }
}

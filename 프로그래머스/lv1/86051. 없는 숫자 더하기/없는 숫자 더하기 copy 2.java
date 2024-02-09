class Solution {
    public int solution (int[] numbers) {
        int answer = 0;
        boolean[] check = new boolean[10];

        for (int num : numbers) {
            check[num] = true;
        }

        for (int i = 1; i<=9; i++) {
            if(!check[i]) {
                answer += i;
            }
        }

        return answer;
    }
}
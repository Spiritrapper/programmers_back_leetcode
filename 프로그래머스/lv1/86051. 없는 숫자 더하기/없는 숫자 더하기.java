import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        for(int i= 0; i<numbers.length; i++){
            answer += (i -numbers[i]);
        }
        for(int i=numbers.length; i<10; i++){
            answer += i ;
        }
        return answer;
    }
}
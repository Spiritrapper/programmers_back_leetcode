// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131705

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[] number) {
        int[] result = {0}; // 결과를 저장할 배열, 배열의 첫 번째 요소를 0으로 초기화
        findCombinations(number, 0, 0, 0, result); // 조합을 찾는 재귀 함수 호출
        return result[0]; // 결과 반환
    }

    private void findCombinations(int[] number, int index, int currentSum, int currentCount, int[] result) {
        if (currentCount == 3) { // 3명의 학생을 선택한 경우
            if (currentSum == 0) {
                result[0]++; // 합이 0이면 결과를 증가시킴
            }
            return;
        }

        if (index >= number.length) {
            return; // 배열 끝까지 검사한 경우 종료
        }

        // 현재 학생을 선택하는 경우
        findCombinations(number, index + 1, currentSum + number[index], currentCount + 1, result);

        // 현재 학생을 선택하지 않는 경우
        findCombinations(number, index + 1, currentSum, currentCount, result);
    }
}
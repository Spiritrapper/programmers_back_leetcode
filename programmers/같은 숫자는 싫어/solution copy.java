// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12906?language=java

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        // 첫 번째 숫자는 항상 결과에 포함
        result.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            // 현재 숫자와 이전 숫자가 다를 때만 결과에 추가
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        
        // 리스트를 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
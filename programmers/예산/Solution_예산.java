// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12982

import java.util.Arrays;
class Solution_예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // 예산을 가장 적게 사용하면서 가능한 많은 부서를 지원하는 방법 찾기
        Arrays.sort(d); // 부서 예산을 오름차순으로 정렬
        
        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) {
                budget -= d[i];
                answer += 1;
            } else {
                break; // 더 이상 지원할 수 없는 부서를 만나면 종료
            }
        }
        
        return answer;
    }
}







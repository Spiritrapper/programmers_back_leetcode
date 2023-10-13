import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0] - 1;
            int end = command[1];
            int k = command[2];

            // 배열 array를 자르고 정렬
            List<Integer> subList = new ArrayList<>();
            for (int j = start; j < end; j++) {
                subList.add(array[j]);
            }
            Collections.sort(subList);

            // k번째 원소를 결과 배열에 저장
            answer[i] = subList.get(k - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = solution.solution(array, commands);

        for (int value : result) {
            System.out.println(value);
        }
    }
}
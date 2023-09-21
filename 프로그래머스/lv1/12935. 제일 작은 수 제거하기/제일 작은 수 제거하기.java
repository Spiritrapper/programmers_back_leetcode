import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1}; // 배열의 길이가 1 이하면 [-1]을 리턴
        }

        int minVal = arr[0]; // 최솟값을 배열의 첫 번째 요소로 초기화
        int minIndex = 0;

        // 최솟값을 찾고 그 인덱스를 저장
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
        }

        // 최솟값을 제외한 나머지 요소를 새 배열에 복사
        int[] result = new int[arr.length - 1];
        int resultIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                result[resultIndex] = arr[i];
                resultIndex++;
            }
        }

        return result;
    }
}







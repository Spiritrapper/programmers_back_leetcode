import java.util.Arrays;

public class Solution {
    public long solution(long n) {
        // 숫자를 문자열로 변환
        String numStr = Long.toString(n);

        // 문자열을 문자(숫자) 배열로 변환
        char[] numArr = numStr.toCharArray();

        // 문자(숫자) 배열을 내림차순으로 정렬
        Arrays.sort(numArr);
        // 정렬된 배열을 역순으로 뒤집음
        reverseArray(numArr);

        // 정렬된 문자(숫자) 배열을 다시 문자열로 변환
        String sortedStr = new String(numArr);

        // 문자열을 정수로 변환하여 반환
        return Long.parseLong(sortedStr);
    }

    // 문자(숫자) 배열을 역순으로 뒤집는 함수
    private void reverseArray(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long n = 118372;
        long result = solution.solution(n);
        System.out.println(result); // 출력 결과: 873211
    }
}
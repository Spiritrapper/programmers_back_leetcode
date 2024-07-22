// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17681

import java.util.ArrayList;
import java.util.List;

public class Solution_비밀지도 {
    public static void main(String[] args) {
        int n1 = 5;
        int[] arr1_1 = {9, 20, 28, 18, 11};
        int[] arr2_1 = {30, 1, 21, 17, 28};
        String[] result1 = solution(n1, arr1_1, arr2_1);
        for (String row : result1) {
            System.out.println(row);
        }

        int n2 = 6;
        int[] arr1_2 = {46, 33, 33, 22, 31, 50};
        int[] arr2_2 = {27, 56, 19, 14, 14, 10};
        String[] result2 = solution(n2, arr1_2, arr2_2);
        for (String row : result2) {
            System.out.println(row);
        }
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i]; // 비트별 OR 연산 수행
            String binary = Integer.toBinaryString(combined); // 이진수로 변환

            // 이진수의 길이가 n보다 짧을 경우, 앞에 0을 채워줍니다.
            while (binary.length() < n) {
                binary = "0" + binary;
            }

            // '#'와 ' '로 변환하여 비밀지도의 한 행을 만듭니다.
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                char ch = binary.charAt(j);
                if (ch == '1') {
                    row.append('#');
                } else {
                    row.append(' ');
                }
            }
            result[i] = row.toString();
        }
        
        return result;
    }
}
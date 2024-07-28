// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12915

import java.util.Arrays;
import java.util.Comparator;

class Solution_마음대로 {
    public String[] solution(String[] strings, int n) {
        // 문자열 배열을 정렬합니다.
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                if (c1 == c2) {
                    return s1.compareTo(s2); // n번째 문자가 같으면 문자열 자체를 사전순으로 정렬
                } else {
                    return c1 - c2; // n번째 문자를 기준으로 오름차순 정렬
                }
            }
        });

        return strings;
    }

    public static void main(String[] args) {
        Solution_마음대로 solution = new Solution_마음대로();

        // 예시 입력
        String[] strings1 = {"sun", "bed", "car"};
        int n1 = 1;

        String[] result1 = solution.solution(strings1, n1);
        System.out.println(Arrays.toString(result1)); // ["car", "bed", "sun"]

        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;

        String[] result2 = solution.solution(strings2, n2);
        System.out.println(Arrays.toString(result2)); // ["abcd", "abce", "cdx"]
    }

    public char[] solution(int[][] sizes1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'solution'");
    }
}

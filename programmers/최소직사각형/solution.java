// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/86491

public class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0; // 가장 큰 가로 길이
        int maxHeight = 0; // 가장 큰 세로 길이

        for (int[] size : sizes) {
            int width = size[0];
            int height = size[1];

            // 현재 명함의 가로 길이와 세로 길이 중 더 큰 값을 최대 가로 길이로 업데이트
            maxWidth = Math.max(maxWidth, Math.max(width, height));
            // 현재 명함의 세로 길이와 가로 길이 중 더 큰 값을 최대 세로 길이로 업데이트
            maxHeight = Math.max(maxHeight, Math.min(width, height));
        }

        return maxWidth * maxHeight; // 가장 큰 가로 길이와 세로 길이를 곱한 값이 최소 지갑 크기
    }

    public static void main(String[] args) {
        Solution_마음대로 solution = new Solution_마음대로();
        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println(solution.solution(sizes1)); // 4000
        System.out.println(solution.solution(sizes2)); // 120
        System.out.println(solution.solution(sizes3)); // 133
    }
}
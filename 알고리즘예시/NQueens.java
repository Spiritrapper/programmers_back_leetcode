package 알고리즘예시;

public class NQueens {
    final int N = 8;

    // 솔루션 출력
    void printSolution(int board[][]) {
        for(int i =0; i< N; i++) {
            for(int j = 0; j < N; j++)
                System.out.println(" " + board[i][j] + " ");
            System.out.println();    
        }
    }

    /*퀸이 board[row][col]에 놓일 수 있는지 확인하는 유틸리티함수.
     * 이 함수sms "col"열까지 퀸이 이미 배치되어 있을 때 호출됩니다.
     * 따라서 공격할 수 있는 퀸을 확인하기 위해 왼쪾만 검사해야 합니다.
     */
    boolean isSafe(int board[][], int row, int col) {
        int i, j;

        // 왼쪽 행에서 이 행을 확인
        for(i = 0; i < col; i++) 
            if(board[row][i] == 1)
                return false;

        // 왼쪽 상단 대각선을 확인
        for(i = row, j= col; i>=0 && j>=0; i--, j--)
            if(board[i][j] == 1)
                return false;

        // 왼쪽 하단 대각선을 확인
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if(board[i][j] == 1) 
                return false;

        return true;
    }

    // N 퀸 문제를 해결하는 재귀적 유틸리티 함수
    boolean solveNQUtil(int board[][], int col) {

        // 기본 케이스: 모든 퀸이 배치되면 true 반환
        if(col >= N) 
            return true;

        // 이 열을 고려하고 이 열에 있는 모든 행에 대해 퀸을 배치해 보십시오
        for (int i = 0; i< N; i++) {
            // 퀸이 board[i][col]에 배치될 수 있는지 확인
            if (isSafe(board, i , col)) {
                // 퀸을 board[i][col]에 배치
                board[i][col] = 1;

                // 나머지 퀸을 배치를 재귀적으로 시도
                if (solveNQUtil(board, col + 1))
                    return true;
                // 만약 boardd[i][col]에 퀸을 배치하는 것이 솔루션으로 이어지지 않으면 
                // board[i][col]
                board[i][col] = 0;      
            }
        }

        // 이 열 col에서 어떤 행에도 퀸을 배치할 수 없으면 false 반환
        return false;
    }

    /* 이 함수는 백트래킹을 사용하여 N 퀸 문제를 해결합니다.
    문제를 해결하기 위해 solveNQUtil()을 주로 사용합니다.
    퀸을 배치할 수 없으면 false를 반환하고
    그렇지 않으면 true를 반환하고 1로 퀸의 배치를 출력합니다. */
    boolean solveNQ() {
        int board[][] = {{0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 0}};

        if (!solveNQUtil(board, 0)) {
            System.out.println("해결책이 존재하지 않습니다");
            return false;
        }

        printSolution(board);
        return true;
    }

    // 테스트하기 위한 드라이버 프로그램
    public static void main(String args[]) {
        NQueens Queen = new NQueens();
        Queen.solveNQ();
    }
}



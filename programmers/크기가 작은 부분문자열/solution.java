// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/147355

class Solution {
    public int solution(String t, String p) {
        int result = 0;
        int tLen = t.length();
        int pLen = p.length();
        
        // t 문자열을 순회하면서 길이가 p와 같은 부분 문자열을 추출하여 비교합니다.
        for (int i = 0; i <= tLen - pLen; i++) {
            String substring = t.substring(i, i + pLen);
            
            // 추출한 부분 문자열이 숫자로만 이루어져 있는지 확인합니다.
            boolean isNumeric = isNumeric(substring);
            
            // 부분 문자열이 숫자로만 이루어져 있을 때 비교합니다.
            if (isNumeric && compareNumericStrings(substring, p) <= 0) {
                result++;
            }
        }
        
        return result;
    }
    
    // 문자열이 숫자로만 이루어져 있는지 확인하는 메서드
    private boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }
    
    // 두 숫자 문자열을 비교하는 메서드
    private int compareNumericStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return -1;
        } else if (str1.length() > str2.length()) {
            return 1;
        }
        return str1.compareTo(str2);
    }
}


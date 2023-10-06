// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12926

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] upper = {'A','B','C','D','E','F','G', 'H','I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        char[] lower = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            // 대문자인 경우
            if(Character.isUpperCase(ch)) {
                answer = getAnswer(ch, answer, upper, n);
            }
            // 소문자인 경우
            else if(Character.isLowerCase(ch)) {
                answer = getAnswer(ch, answer, lower, n);
            } else {
                answer += " ";
            }
        }

        return answer;
    }

    public String getAnswer(char ch, String answer, char[] charArr, int n) {
         for(int j=0; j < charArr.length; j++) {
            if(ch == charArr[j]){
                // 배열 길이 초과한 경우
                if(j+n >= charArr.length) {
                    if(charArr.length - j -n < 0) {
                        answer += charArr[-(charArr.length - j -n)];    
                    } else {
                        answer += charArr[charArr.length - j -n];    
                    }

                }else {
                    answer += charArr[j+n]; 

                }       
            }
        }
        return answer;
    }
}
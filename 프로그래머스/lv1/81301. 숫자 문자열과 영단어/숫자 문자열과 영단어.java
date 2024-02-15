import java.util.HashMap;

class Solution {
    public int solution(String s) {
        // 영단어 대응 표를 HashMap으로 생성
        HashMap<String, String> wordToNumber = new HashMap<>();
        wordToNumber.put("zero", "0");
        wordToNumber.put("one", "1");
        wordToNumber.put("two", "2");
        wordToNumber.put("three", "3");
        wordToNumber.put("four", "4");
        wordToNumber.put("five", "5");
        wordToNumber.put("six", "6");
        wordToNumber.put("seven", "7");
        wordToNumber.put("eight", "8");
        wordToNumber.put("nine", "9");

        StringBuilder answer = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        try {
            for (char c : s.toCharArray()) {
                // 현재 문자가 알파벳인 경우 currentWord에 추가
                if (Character.isAlphabetic(c)) {
                    currentWord.append(c);
                    // currentWord가 영단어로 표현된 숫자인 경우, 숫자로 변환하여 answer에 추가
                    if (wordToNumber.containsKey(currentWord.toString())) {
                        answer.append(wordToNumber.get(currentWord.toString()));
                        currentWord.setLength(0);  // currentWord 초기화
                    }
                }
                // 현재 문자가 숫자인 경우
                else {
                    // 현재 문자를 그대로 answer에 추가
                    answer.append(c);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // answer를 정수로 변환하여 반환
        return Integer.parseInt(answer.toString());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("one4seveneight"));  // 1478
        System.out.println(solution.solution("23four5six7"));      // 234567
        System.out.println(solution.solution("2three45sixseven"));// 234567
        System.out.println(solution.solution("123"));             // 123
    }
}

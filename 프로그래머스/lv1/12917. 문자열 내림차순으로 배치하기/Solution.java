import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        //String[] array =map(String, s.split(""));
        char[] charArray = s.toCharArray();

        Arrays.sort(charArray);
        
        for(int i=0; i< charArray.length/2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length-1-i];
            charArray[charArray.length -1-i]=temp;
        }
        answer = new String(charArray);

        return answer;
    }
}
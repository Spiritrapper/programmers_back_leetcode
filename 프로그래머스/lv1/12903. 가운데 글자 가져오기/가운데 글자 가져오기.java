class Solution {
    public String solution(String s) {
        String answer = "";
        
        
        if(s.length()%2 == 0){
            int a = (s.length()/2)-1;
            int a1 = s.length()/2;
            answer += s.charAt(a);
            answer += s.charAt(a1);
        }else{
            int a = s.length()/2;
            answer += s.charAt(a);
        }
            
       
        return answer;
    }
}
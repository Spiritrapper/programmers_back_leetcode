class _12903가운데글자가져오기 {
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

    public static void main(String[] args) {
        _12903가운데글자가져오기 s= new _12903가운데글자가져오기();
        String answer= "fafdafaffKL";
        String result = s.solution(answer); // solution 메서드의 반환값을 변수에 저장
        System.out.println(result); // 결과 출력
    }
}
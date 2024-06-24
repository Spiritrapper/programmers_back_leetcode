class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuffer left = new StringBuffer();
        StringBuffer right = new StringBuffer();

        for(int i = 1 ; i < food.length; i++){
            if(food[i] % 2 !=0){
                food[i] -= 1;
            }
        }
        for(int i = 1; i < food.length; i++){
            int number = food[i] / 2;
            while(number != 0){
                left.append(i);
                number--;
            }
        }
        String value = left.toString();
        for(int i = value.length() -1; i >= 0; i--){
            right.append(value.charAt(i));
        }
        answer += left;
        answer += "0";
        answer += right;
        return answer;
    }
}
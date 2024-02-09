

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n => 12
        for(int i=2; i < n; i++){
            if(n%i==1){
                return i; // 리턴시 바로 함수 종료이기에 가장 작은수 반환
            }
        }
        return answer;
    }
}


class Solution1 {
    public int solution(int n) {
        int answer = 0;
        
        // n => 12
        for(int i=2; i < n; i++){
            if(n%i==1){
                answer = i;
                break; //break없다면 마지막 저장된 가장 큰수를 반환

            }
        }
        return answer;
    }
}
//네, 두 코드는 서로 다른 결과를 반환합니다.

//첫 번째 코드에서는 return i;를 만족하는 경우에 i 값을 반환하고 함수를 종료합니다. 따라서 조건을 만족하는 첫 번째 숫자만 반환됩니다.
/* 
반면에 두 번째 코드에서는 answer = i;를 사용하여 조건을 만족하는 모든 숫자를 저장합니다. 따라서 for 반복문이 끝나고 answer에 저장된 값이 반환됩니다. 
만약 조건을 만족하는 숫자가 없으면 answer의 초기값인 0이 반환됩니다.

결과적으로 두 코드의 동작 방식이 다르므로 결과도 다를 수 있습니다. 첫 번째 코드는 조건을 만족하는 첫 번째 숫자만 반환하는 반면, 
두 번째 코드는 조건을 만족하는 모든 숫자 중 가장 큰 숫자를 반환합니다*/
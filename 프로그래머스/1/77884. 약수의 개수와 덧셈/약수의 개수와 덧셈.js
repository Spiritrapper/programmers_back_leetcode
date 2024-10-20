function solution(left, right) {
    var answer = 0;
    
    for(let i =left; i<=right; i++){
        if(numCount(i)%2===0){
            answer +=i
        }else{
            answer -=i
        }
    }
    
    
    return answer;
}

function numCount (n){
        let count = 0
        for(let i=1; i<n+1; i++){
            if(n%i===0){
                count++
            }
    }
        return count;
}
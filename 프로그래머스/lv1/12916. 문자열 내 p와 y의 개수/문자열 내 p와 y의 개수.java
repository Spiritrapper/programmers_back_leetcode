class Solution {

	    boolean solution(String s) {
	        boolean answer = true;
	        String [] array =s.split("");
	        int pcnt = 0;
	        int ycnt = 0;
	        for(int i =0; i< array.length; i++){
//	            if(array[i] == "p" || array[i] == "P"){
	            if(array[i].equals("p") || array[i].equals("P") ){
	                pcnt += 1;
	            }else if (array[i].equals("Y")|| array[i].equals("y")){
	                ycnt +=1;
	            }
	            
	        }
	                      
	        if(pcnt == ycnt){
	            return true;
	        }else {
	            return false;
	        }
	        
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//	        System.out.println("Hello Java");

//	        return answer;
	    }
	}


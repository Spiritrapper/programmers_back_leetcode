class Solution {
    public boolean solution(int x) {
      String s = Integer.toString(x);
        String[] array = s.split("");
        int sum=0;
        for(int i=0; i<array.length;i++){
            sum += Integer.parseInt(array[i]);
        }
        if(x%sum==0){
            return true;
        }else{
            return false;
        }
        
    }
}
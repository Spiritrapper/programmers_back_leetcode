class 두정수사이의합 {
    public long solution(int a, int b) {
        
        
        long sum=0;
        if(a<=b){
            for(int i=a; i<=b; i++){
            sum += i;
            }
        }else{
            for(int i=b; i<=a; i++){
            sum += i;
        }
        }
        
        
        return sum;
    }

    public static void main(String[] args) {
        
        두정수사이의합 a = new 두정수사이의합();
        System.out.println(a.solution(1, 10));
    }
}
import java.util.Scanner;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum =0;
        for (int i =0; i<arr.length; i++){
            sum  += arr[i];
            
        }
        answer = sum/arr.length;
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        Solution s = new Solution();
        double answer = s.solution(arr);
        System.out.println(answer);
    }
}
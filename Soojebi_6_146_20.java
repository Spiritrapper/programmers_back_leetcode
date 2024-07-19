public class Soojebi_6_146_20 {
    public static void main(String[] args) {
        int[] result = new int[5];
        int [] arr = {79,34,10,99,50};
        
        for(int i = 0; i< 5; i++){
            result[i] = 1;

        for (int j=0; j< 5; j++) {
            if(arr[i]<arr[j]) result[i]++;
        }
    }
    for(int k = 0; k< 5; k++) {
        System.out.println(result[k]);
    }
    }

}

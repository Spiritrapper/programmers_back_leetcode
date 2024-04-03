package 알고리즘예시;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i =0; i< n-1; i++) {    // 배열의 순회
            for(int j= 0; j<n-i-1; j++) {   // 현재 요소와 다음 요소 비교 정렬
                if(arr[j] > arr[j+1]) {
                    // 현재 요소와 다음 요소를 비교하여 정렬 순서가 아니라면 교환
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for(int num : arr)  {
            System.out.println(num + " ");
        }
    }
}
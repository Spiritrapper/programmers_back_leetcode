package 알고리즘예시;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length; // 배열의 길이를 구함
        for(int i = 1; i < n; i++) {    // 배열을 순회
            int key = arr[i];   // 현재 요소를 key로 설정
            int j = i -1;
            // key보다 큰 요소를 오른쪽으로 이동시키면서 삽입 위치 찾음
            while ( j>=0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j= j -1;
            }
            arr[j + 1] = key; // key를 삽입
        }
    }

    public static void main(String[] args) {
        int[] arr= {5, 3, 8, 1, 2};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for(int num : arr )  {
            System.out.println(num + " ");
        }
    }


}

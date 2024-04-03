package 알고리즘예시;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i< n-1; i++)  { // 배열의 순회
            int minIndex = i;   // 최소값의 인덱스를 현재 인덱스로 설정
            for (int j= i+1; j< n; j++) {   // 현재 인덱스 다음부터 배열의 끝까지 순회
                if(arr[j] < arr[minIndex] ) {   // 최소값을 찾음
                    minIndex = j;   // 최소값의 인덱스를 업데이트
                }
            }
            // 현재 인덱스와 최소값의 인덱스를 교환
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] =temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2}; // 정렬 되지 않은 배열
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for(int num : arr) { // 정렬 배열 출력
            System.out.println(num + " ");
        }
    }
}

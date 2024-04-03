package 알고리즘예시;

public class QuickSort {
        public static void quickSort(int[] arr, int low, int high) {
            if ( low < high) {
                int pi = partition(arr, low, high); // 파티션을 통해 기준 원소의 인덱스를 찾음
                quickSort(arr, low, pi - 1);    // 기준 원소의 왼쪽 부분 배열을 재귀적으로 정렬
                quickSort(arr, pi + 1, high);   // 기준 원소의 오른쪽 부분 배열을 재귀적으로 정렬
            }
        }

        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];  // 기준 원소를 배열 의 마지막 요소로 선택
            int i = low - 1;    // i를 기준으로 작은 값들의 인덱스를 관리

            for (int j = low; j< high; j++)  {
                if (arr[j] < pivot) {   // 현재 요소가 기준 원소보다 작은 경우
                    i++;
                    // 현재 요소와 i 위치에 있는 값 교환
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }


            int temp = arr[i +1];
            arr[i + 1]  = arr[high];
            arr[high] = temp;

            return i + 1;
        }
        public static void main(String[] args) {
            int[] arr = {10, 7, 8, 9, 1, 5}; // 정렬되지 않은 배열
            int n = arr.length;
            quickSort(arr, 0, n - 1); // 배열을 퀵 정렬로 정렬
            System.out.print("Sorted array: ");
            for (int num : arr) { // 정렬된 배열 출력
                System.out.print(num + " ");
            }
        }
}

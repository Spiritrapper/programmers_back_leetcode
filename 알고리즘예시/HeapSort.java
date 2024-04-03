package 알고리즘예시;

public class HeapSort {
    public void heapSort(int[] arr) {
        int n = arr.length;

        // 배열을 최대 힙으로 만듦
        for (int i = n / 2 -1; i >= 0; i--) {
            heapify(arr, n , i);
        }

        // 힘을 정렬
        for (int i = n -1; i > 0; i--) {
            // 최대값(루트)과 마지막 요소 교환
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // 힘 크기를 줄여서 마직 요소를 제외하고 다시 최대 힘으로 만듦
            // for문을 통해 i--가 줄어듬에 따라 최대값이 제외되어 호출
            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i; // 최대값을 현재 노드로 설정
        int left = 2 * i + 1; // 왼쪽 자식
        int right = 2 * i + 2; // 오른쪽 자식

        // 왼쪽 자식이 더 크다면 
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // 오른쪽 자식이 더 크다면
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // 최대값이 현재 노드가 아니라면 교환
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // 변경된 하위 트리에 대해 재귀적으로 heapify 호출
            heapify(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort.heapSort(arr); 
        System.out.println("Sorted array");
        for(int num : arr) {
            System.out.println(num + " ");
        }
    }
}

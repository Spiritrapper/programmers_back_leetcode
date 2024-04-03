package 알고리즘예시;


public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left <right) {
            int mid= (left + right)/ 2; // 중간 지점을 찾음
            mergeSort(arr, left, mid);  // 왼쪽 부분 배열을 정렬
            mergeSort(arr, mid +1, right);  // 오른쪽 부분 배열을 정렬
            merge(arr, left, mid, right);   // 정렬된 부분 배열을 병합
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        // 배열의 길이를 구할때는 시작과 끝 인덱스 사이의 거리에 1을 더함 0부터이기에 

        int n1 = mid - left + 1; // left 경우 인덱스 0부터이기에 +1
        int n2 = right - mid; // 인덱스 mid + 1이기에 

        int[] L = new int[n1];
        int[] R = new int[n2];

        // 임시 배열에 데이터 복사
        for (int i = 0; i< n1; ++i)
            L[i] = arr[left + i]; // left시작 고정값 
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];
        

        // 두 임시 배열을 비교하여 병할
        int i = 0, j= 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // 남은 요소들을 복사
        while (i < n1) {
            arr[k] =L[j];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
            
        
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        System.out.println("Sorted array: ");
        for(int num : arr) {
            System.out.println(num + " ");
        }
    }
}
package 알고리즘예시;

import java.util.Arrays;

public class RadixSort {
    public void radixSort(int[] arr) {
        int n = arr.length;

        // 입력 배열의 최댓값 찾기
        int max = Arrays.stream(arr).max().getAsInt();

        // 각 자릿수에 대해 계수 정렬 수행
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, n, exp);
        }
    }

    private void countingSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        // 각 자릿수에 대한 빈도수 카운트
        for(int i = 0; i< n; ++i) {
            count[(arr[i] / exp) % 10]++; // %10나눈 한자릿수 를 키값으로 count
        }

        // 빈도수 카운트 업데이트
        for(int i = 1; i < 10; ++i) {
            count[i] += count[i - 1];
        }

        // 정렬된 배열 생성
        for (int i = n -1; i>=0; --i) {
            output[count[(arr[i] / exp) % 10] -1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // 정렬된 배열을 원래 배열에 복사
        for (int i = 0; i< n; ++i) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        RadixSort radixSort = new RadixSort();
        int[] arr = {170, 45, 75, 90, 803, 24, 2, 66}; // 정렬되지 않은 배열
        
        radixSort.radixSort(arr); // 배열을 퀵 정렬로 정렬
        System.out.print("Sorted array: ");
        for (int num : arr) { // 정렬된 배열 출력
            System.out.print(num + " ");
        }
    }
}

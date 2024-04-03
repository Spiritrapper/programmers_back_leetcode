package 알고리즘예시;

public class CountingSort {
    public void countingSort(int[] arr) {
        int n = arr.length;

        int max = arr[0];
        for (int i = 1; i < n; ++i) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        //카운트 배열 초기화
        // int[] count = new int[max + 1];
        // for (int i=0; i<= max; ++i) {
        //     count[i] = 0;
        // }

        int totalCount = 0;
        for (int i = 0; i < n; ++i) {
            totalCount += arr[i];
        }

        int[] count = new int[totalCount + 1];

        // for (int i = 0; i <= totalCount; ++i) {
        //     count[i] = 0;
        // }

        // 각 요소의 빈도수 카운트
        for (int i = 0; i< n; ++i) {
            ++count[arr[i]];
        }

        // 카운트 배열 업데이트
        for (int i = 1; i<= max; ++i) {
            count[i] += count[i - 1];
        }

        // 정렬된 배열 만들기
        int[] output = new int[n];
        for (int i = n -1; i >= 0; --i) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        // 정렬된 배열을 원래 배열에 복사
        for (int i = 0; i< n; ++i) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort.countingSort(arr);
        System.out.println("Sorted array");
        for(int num : arr) {
            System.out.println(num + " ");
        }
    }
}

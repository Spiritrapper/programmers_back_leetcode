def solution(arr):
    if len(arr) <= 1 or arr == [10]:
        return [-1]

    min_value = arr[0]
    min_index = 0

    # 배열에서 최소값을 찾음
    for i in range(1, len(arr)):
        if arr[i] < min_value:
            min_value = arr[i]
            min_index = i

    # 최소값을 제거한 배열 반환
    arr.pop(min_index)
    
    return arr

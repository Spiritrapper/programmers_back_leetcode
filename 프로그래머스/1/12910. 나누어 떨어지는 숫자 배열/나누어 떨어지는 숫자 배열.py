def solution(arr, divisor):
    answer = []
    for i in range(len(arr)):  # 0부터 시작하는 루프
        if arr[i] % divisor == 0:
            answer.append(arr[i])  # i가 아닌 arr[i]를 추가 (값을 추가)
    
    if not answer:  # answer 리스트가 비어있으면
        return [-1]  # -1을 반환
    
    return sorted(answer)

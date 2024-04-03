def solution(arr, divisor):
    answer = []
    for num in arr:
        if num % divisor == 0:
            answer.append(num)
    
    if not answer:
        return [-1]
    
    answer.sort()
    return answer


# 예시 1
arr1 = [5, 9, 7, 10]
divisor1 = 5
print(solution(arr1, divisor1))  # [5, 10] 출력


def solution(n):
    answer = []
    while n>0:
        a = n % 10
        answer.append(a)
        n = n //10
    return answer


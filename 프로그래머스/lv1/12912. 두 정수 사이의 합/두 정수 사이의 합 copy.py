def solution(a, b):
    sum = 0
    if a > b:
        for i in range(b, a+1):
            sum += i
    else:
        for i in range(a, b+1):
            sum += i

    return sum

a1 = 10
b1 = 1
print(solution(10,1))
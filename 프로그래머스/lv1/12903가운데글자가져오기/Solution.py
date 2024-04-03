def solution(s):
    length = len(s)
    if length % 2 == 0:
        mid = length // 2
        answer = s[mid - 1] + s[mid]
    else:
        mid = length // 2
        answer = s[mid]
    return answer

# 입력 받기
input_string = input("문자열을 입력하세요: ")

# 함수 호출
result = solution(input_string)

# 출력
print(f"입력한 문자열의 가운데 문자는 '{result}'입니다.")

def solution(x):
    # 정수를 문자열로 변환
    s = str(x)

    # 문자열을 문자 단위로 분할하여 리스트로 만듦
    array = list(s)

    # 문자 단위로 분할된 숫자들의 합을 계산
    total = sum(int(char) for char in array)

    # x가 숫자들의 합으로 나누어지는지 확인
    if x % total == 0:
        return True
    else:
        return False
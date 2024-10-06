def solution(n):
    # 1. 정수 n을 문자열로 변환한 뒤, 리스트로 분리
    digits = list(str(n))
    result = []

    # 2. 남은 숫자가 없을 때까지 반복
    while digits:
        max_digit = digits[0]  # 첫 번째 값을 기준으로 설정
        max_index = 0  # 최대값의 인덱스를 저장

        # 3. 나머지 숫자들과 비교하면서 최대값 갱신
        for i in range(1, len(digits)):
            if digits[i] > max_digit:
                max_digit = digits[i]
                max_index = i
        
        # 4. 최대값을 결과 리스트에 추가하고, 원본 리스트에서 제거
        result.append(max_digit)
        digits.pop(max_index)
    
    # 5. 정렬된 자릿수를 다시 하나의 문자열로 합친 후, 정수로 변환
    answer = int("".join(result))
    
    return answer

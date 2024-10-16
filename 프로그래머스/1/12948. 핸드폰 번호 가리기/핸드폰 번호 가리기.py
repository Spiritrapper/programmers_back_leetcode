def solution(phone_number):
    # 전화번호 뒷 4자리를 제외한 부분을 '*'로 변환
    masked_part = '*' * (len(phone_number) - 4)
    
    # 뒷 4자리를 그대로 두고 합침
    answer = masked_part + phone_number[-4:]
    
    return answer
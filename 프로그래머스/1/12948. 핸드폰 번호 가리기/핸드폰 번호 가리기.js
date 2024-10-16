function solution(phone_number) {
    // 전화번호 뒷 4자리를 제외한 부분을 '*'로 변환
    let maskedPart = '*'.repeat(phone_number.length - 4);
    
    // 뒷 4자리를 그대로 두고 합침
    let answer = maskedPart + phone_number.slice(-4);
    
    return answer;
}
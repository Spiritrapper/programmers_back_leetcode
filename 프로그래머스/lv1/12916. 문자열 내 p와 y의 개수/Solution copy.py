def solution(s):
	s = s.lower()
	p_count = s.count('p')
	y_count = s.count('y')
	return p_count == y_count

s1 = "python pleasye"
print(solution(s1))



s = input()

is_symmetric = True
length = len(s)

for i in range(length // 2):
    if s[i] != s[length -i -1]:
        is_symmetric = False
        break

if is_symmetric:
    print('1')
else:
    print('0')

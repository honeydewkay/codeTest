a, b = map(int, input().split())

prod = 1
found = False  # a의 배수가 하나라도 있는지 확인

for i in range(a, b + 1, a):  # a의 배수만 반복
    prod *= i
    found = True

# 만약 a의 배수가 하나도 없으면 결과를 1로 설정
print(prod if found else 1)
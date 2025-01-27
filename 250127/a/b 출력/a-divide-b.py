from decimal import Decimal, getcontext

i = input()
arr = i.split()
a = int(arr[0])
b = int(arr[1])
# c = (float)(a // b)
# print(c)

# 입력 받기
# a = int(input())
# b = int(input())

# Decimal 연산 설정: 소수점 22자리까지 계산
getcontext().prec = 22
result = Decimal(a) / Decimal(b)

# 소수점 21번째 자리에서 내림
result = result.quantize(Decimal('1.' + '0' * 20))

# 결과 출력
print(result)
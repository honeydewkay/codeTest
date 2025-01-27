from decimal import Decimal, getcontext

# 입력 받기
a, b = map(int, input().split())

# Decimal 연산 설정: 소수점 22자리까지 계산
getcontext().prec = 22
result = Decimal(a) / Decimal(b)

# 소수점 21번째 자리에서 내림
result = result.quantize(Decimal('1.' + '0' * 20))

# 결과 출력
print(result)
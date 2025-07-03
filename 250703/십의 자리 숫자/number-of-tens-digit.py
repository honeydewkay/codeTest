nums = list(map(int, input().split()))
count = [0] * 10  # 0~9 십의 자리 숫자 개수 저장

for num in nums:
    if num == 0:
        break
    tens = num // 10
    # 55면 5, 47이면 4
    count[tens] += 1

# 1부터 9까지 출력
for i in range(1, 10):
    print(f"{i} - {count[i]}")

cnt = 0
for _ in range(10):  # 10개의 수를 입력받음
    num = int(input())
    if num % 2 == 1:  # 홀수인지 확인
        cnt += 1
print(cnt)
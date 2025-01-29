n = int(input())  # n 입력받기

for i in range(1, n + 1):
    if i % 2 == 0:  # 2로 나누어 떨어지는 경우
        continue
    if i % 10 == 5:  # 일의 자리가 5인 경우
        continue
    if i % 3 == 0 and i % 9 != 0:  # 3으로 나누어 떨어지지만 9로는 나누어 떨어지지 않는 경우
        continue
    
    print(i, end=" ")  # 온전수 출력
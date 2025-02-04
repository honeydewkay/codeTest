n = int(input())

for i in range(n):
    if i % 2 == 0:  # 홀수 번째 줄 (0-based index)
        print("*")
    else:  # 짝수 번째 줄
        print("* " * (i + 1))
        
n = int(input())

# 위쪽 삼각형 출력
for i in range(n):
    print(" " * (n - 1 - i) + "@ " * (i + 1))

# 아래쪽 역삼각형 출력
for i in range(n - 1):
    print("@ " * (n - 1 - i))

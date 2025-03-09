a, b = map(int, input().split())
cnt = 1
for row in range(a):
    for elem in range(b):
        print(cnt, end=" ")
        cnt += 1
    print()
a, b = map(int, input().split())
cnt = 0
for i in range(a, b+1):
    if i % 5 == 0:
        cnt += i
print(cnt)
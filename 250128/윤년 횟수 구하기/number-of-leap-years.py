n = int(input())
cnt = 0
i = 1
for i in range(n+1):
    if i % 100 == 0 and i % 400 != 0:
        cnt -= 1
    elif i % 4 == 0:
        cnt += 1

print(cnt)
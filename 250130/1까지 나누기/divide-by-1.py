n = int(input())
cnt = 0
i = 1
while n > 1:
    n = n // i
    cnt += 1
    i += 1
    if n <= 1:
        break
print(cnt)
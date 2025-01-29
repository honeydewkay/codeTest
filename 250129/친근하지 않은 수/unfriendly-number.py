n = int(input())
cnt = 0
for i in range(n+1):
    if i % 2 == 0:
        continue
    elif i % 3 == 0:
        continue
    elif i % 5 == 0:
        continue
    else:
        cnt += 1
print(cnt)

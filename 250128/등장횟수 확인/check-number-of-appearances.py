cnt = 0
for i in range(5):
    i = int(input())
    n = i
    if n % 2 == 0:
        cnt += 1
        continue
print(cnt)
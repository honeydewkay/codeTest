cnt = 0
n = int(input())
while True:
    if n >= 1000:
        break
    elif n % 2 == 0:
        n = n * 3 + 1
        cnt += 1
    elif n % 2 == 1:
        n = n * 2 + 2
        cnt += 1
print(cnt)
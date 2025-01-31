n = int(input())
cnt = 0
while True:
    # cnt += 1 # if n != 1: 조건이 있어서, n == 1이 되어도 cnt += 1이 먼저 실행된 후 break
    if n != 1:
        cnt += 1
        if n % 2 == 0:
            n = n // 2
            continue
        elif n % 2 == 1:
            n = n * 3 + 1
            continue
            
    else:
        break

print(cnt)
    

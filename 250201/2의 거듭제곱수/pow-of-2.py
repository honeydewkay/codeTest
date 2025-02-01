n = int(input())
x = 0
while True:
    if n != 1:
        x += 1
        n /= 2
    if n == 2:
        x += 1
        break
    
print(x)




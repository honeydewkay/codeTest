n = int(input())
x = 0
while True:
    if n == 2:
        x += 1
        break
    if n != 1:
        x += 1
        n = n //2
        continue
    
print(x)




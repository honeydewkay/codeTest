n = int(input())
x = 65
for i in range(n):
    for j in range(i+1):
        if x == 91: x = 65
        print(chr(x), end="")
        x += 1
    print()

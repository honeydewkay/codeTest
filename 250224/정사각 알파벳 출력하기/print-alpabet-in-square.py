n = int(input())
x = 65
for i in range(n):
    for j in range(n):
        print(chr(x), end="")
        x += 1
    print()
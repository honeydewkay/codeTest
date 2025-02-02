x = 0
n = int(input())
for i in range(n):
    x += 1
    for k in range(i+x):
        print("*", end="")
    print()
n = int(input())

for i in range(n+1):
    for j in range(1,n,2):
        print(" "*(i), end="")
    for j in range(n-i, 0, -1):
        print(j, end=" ")
    print()
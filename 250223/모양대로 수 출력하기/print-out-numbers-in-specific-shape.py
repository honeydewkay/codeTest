n = int(input())

for i in range(n):
    print("  " * (i), end="") 
    for j in range(n - i, 0, -1):  # N부터 1까지 감소하며 출력
        print(j, end=" ")
    print()

a, b = map(int, input().split())
n = 2
for i in range(b):
    for j in range(b, a-1, -1):
        if j < b-1:
            print(f"{j} * {n} = {j*n}", end=" ")
        else:
            print(f"{j} * {n} = {j*n}", end=" / " )
    n += 2
    print()
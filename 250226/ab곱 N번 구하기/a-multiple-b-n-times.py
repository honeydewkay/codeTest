n = int(input())

for i in range(n):
    a, b = map(int, input().split())

    prod_val = 1
    for i in range(a, b+1):
        prod_val *= i
    print(prod_val)
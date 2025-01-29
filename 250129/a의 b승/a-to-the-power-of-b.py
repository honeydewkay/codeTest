a , b = map(int, input().split())
prod = a
for i in range(a, b+1):
    prod *= a
print(prod)
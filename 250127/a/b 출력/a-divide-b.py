a, b = map(int, input().split())

print(f"{a//b}", end=".")
a = a - (a//b)*b

for _ in range(20):
    a *= 10
    print(f"{a//b}", end="")
    a -= (a//b)*b
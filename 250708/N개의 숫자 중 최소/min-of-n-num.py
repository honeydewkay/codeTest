import sys
n = int(input())
a = list(map(int, input().split()))

# Please write your code here.
min_val = sys.maxsize

for i in a:
    if i < min_val:
        min_val = i

print(min_val, a.index(min_val), end=" ")
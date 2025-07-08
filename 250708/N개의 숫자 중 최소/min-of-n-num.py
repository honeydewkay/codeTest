import sys
n = int(input())
a = list(map(int, input().split()))

# Please write your code here.
min_val = sys.maxsize

for i in a:
    if i < min_val:
        min_val = i

min_cnt = a.count(min_val)
print(min_val, min_cnt, end=" ")
import sys
nums = list(map(int, input().split()))

max_val = -sys.maxsize

for i in nums:
    if i > max_val:
        max_val = i

print(max_val)
n = int(input())
nums = list(map(int, input().split()))

# Please write your code here.
max_val = -1

for current in nums:
    if current > max_val:
        cnt = 0
        for i in nums:
            if i == current:
                cnt += 1
        if cnt == 1:
            max_val = current

print(max_val)
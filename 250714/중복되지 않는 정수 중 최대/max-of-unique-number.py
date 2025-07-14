n = int(input())
nums = list(map(int, input().split()))
# Please write your code here.

max_val = -1

for curr_num in nums:
    if curr_num > max_val:
        cnt = 0
        for i in nums:
            if i == curr_num:
                cnt += 1
        if cnt == 1:
            max_val = curr_num

print(max_val)
# else:
#     print(nums[0])
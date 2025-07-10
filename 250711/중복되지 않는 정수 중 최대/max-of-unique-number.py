n = int(input())
nums = list(map(int, input().split()))

# Please write your code here.
nums.sort(reverse=True)

for i in range(n):
    if nums[0] == nums[1]:
        print(-1)
        break
    else:
        print(nums[0])
        break
n = int(input())
cnt_sum = 0
cnt = 0
for i in range(n):
    num = int(input())
    cnt_sum += num
    cnt += 1

print("%d %.1f"%(cnt_sum, cnt_sum/cnt))

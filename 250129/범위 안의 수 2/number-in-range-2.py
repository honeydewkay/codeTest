sum_val = 0
cnt = 0
for i in range(10):
    i = int(input())
    if i >= 0 and i <= 200:
        sum_val += i
        cnt += 1

print("%d %.1f" % (sum_val, sum_val/cnt))
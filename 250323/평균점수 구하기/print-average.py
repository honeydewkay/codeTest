arr = list(map(float, input().split()))
n = len(arr)
sum_val = 0
for i in range(n):
    sum_val += arr[i]
avg = sum_val / n
print(f"{avg:.1f}")
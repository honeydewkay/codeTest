arr = list(map(int, input().split()))
arr2 = []
for i in arr:
    if i == 0:
        break
    else:
        arr2.append(i)
sum_value = 0
n = len(arr2)
for i in range(n):
    sum_value += arr2[i]

avg = sum_value / n
print(sum_value, f"{avg:.1f}")        
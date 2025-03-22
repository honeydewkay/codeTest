num = list(map(int, input().split()))
under_250_val = []
for i in num:
    if i < 250:
        under_250_val.append(i)
    else:
        break
n = len(under_250_val)
sum_val = 0
for i in range(n):
    sum_val += under_250_val[i]
avg = sum_val / n
print(sum_val, avg)
    
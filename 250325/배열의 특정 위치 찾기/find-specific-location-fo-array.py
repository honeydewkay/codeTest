lst = list(map(int, input().split()))
cnt = 0
lst_even = lst[1::2]
lst_3 = lst[2::3]
sum_val = sum(lst_even)
sum_val_3 = 0
for i in lst_3:
    sum_val_3 += i
    cnt += 1
avg = sum_val_3 / cnt
print(sum_val, avg, end=" ")

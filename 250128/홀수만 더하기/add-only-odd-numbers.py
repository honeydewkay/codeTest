n = int(input())
sum_val = 0
for i in range(n):
    num = int(input())
    if num % 2 == 1 and num % 3 == 0:
        sum_val += num
print(sum_val)

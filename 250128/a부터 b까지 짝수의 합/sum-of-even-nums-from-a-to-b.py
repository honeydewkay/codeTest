a, b = map(int, input().split())
cnt_val = 0
for i in range(a, b+1):
    if i % 2 == 0:
        cnt_val += i
print(cnt_val)        
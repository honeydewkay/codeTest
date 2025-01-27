n = int(input())
cnt_gyo = 0
cnt_bok = 0
cnt_hwa = 0
i = 1
for i in range(1, n+1):
    if i % 12 == 0:
        cnt_hwa += 1
        continue
    elif i % 3 == 0:
        cnt_bok += 1
        continue
    elif i % 2 == 0:
        cnt_gyo += 1
        continue

print(cnt_gyo, cnt_bok, cnt_hwa)

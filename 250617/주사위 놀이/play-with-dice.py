cnt_arr = [0] * 7

arr = list(map(int, input().split()))

for i in arr:
    cnt_arr[i] += 1

for i in range(1, 7):
    cnt = cnt_arr[i]
    print(f"{i} - {cnt}")

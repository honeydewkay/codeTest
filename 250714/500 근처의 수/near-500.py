n = 10
lst = list(map(int, input().split()))
min_lst = []
max_lst = []
for i in lst:
    if i < 500:
        max_lst.append(i)
    if i > 500:
        min_lst.append(i)

print(max(max_lst), min(min_lst), end= " " )

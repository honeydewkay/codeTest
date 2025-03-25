arr = list(map(int, input().split()))
arr2 = []
for i in arr:
    if i == 0:
        break
    elif i != 0 and i % 2 ==0:  
        arr2.append(i)
#개수와 합계
cnt = len(arr2)
sum_val = 0
for i in range(cnt):
    sum_val += arr2[i]
    

print(cnt, sum_val)
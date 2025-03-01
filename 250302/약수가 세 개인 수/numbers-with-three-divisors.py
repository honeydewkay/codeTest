start, end = map(int, input().split())

three_yak = 0
# Please write your code here.
for i in range(start, end+1):
    yak = 0
    for j in range(2, i): # 2~i-i사이에 약수가 1개라도 존재하면 yak += 1
        if i % j == 0:
            yak += 1
    if yak == 1:
        three_yak +=1

print(three_yak)
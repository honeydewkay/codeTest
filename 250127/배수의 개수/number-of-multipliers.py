cnt_three = 0
cnt_five = 0

for _ in range(10):  # 10개의 수를 입력받음
    num = int(input())
    if num % 3 == 0:  
        cnt_three += 1
    if num % 5 == 0:
        cnt_five += 1
print(cnt_three, end=" ")
print(cnt_five)
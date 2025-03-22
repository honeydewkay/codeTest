num = list(map(int, input().split()))

# for i in num:
#     i >= 250:
#         탈출
#     else:
#         마지막 원소 지우기
# 연산
# s = sum(num)
# avg = s / len(num)
# 프린트 s, avg
    
for i in num:
    if i >= 250:
        break
    else:
        num.pop()

s = sum(num)
avg = s / len(num)

print(s, avg)
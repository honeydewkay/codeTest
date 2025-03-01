start, end = map(int, input().split())

complete = 0
# Please write your code here.
# 3이면 1, 3 1+3
for i in range(start, end+1): # start부터 end까지 반복
    jin = 0 # 진약수 초기화
    for j in range(1, i): # i 자신은 포함X  1~i-1   
        if i % j == 0: # i가 j로 나누어 떨어지면 (진약수)
            jin += j # 진약수 합 누적
    if jin == i: # 진약수 합이 자기 자신과 같다면 완전수
        complete += 1
print(complete)
    
    
    
n = int(input())
a = list(map(int, input().split()))

# Please write your code here.
# 이문제는 카데인 알고리즘으로 풀면 됨

max_sum = a[0] # 최댓값을 첫번째 원소로 지정
current_sum = a[0] # 누적합도 우선 첫번째 원소로 지정

for i in range(1,n):
    current_sum = max(a[i], current_sum + a[i])
    max_sum = max(max_sum, current_sum)

print(max_sum)
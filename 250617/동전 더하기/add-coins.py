n, k = map(int, input().split())
coins = [int(input()) for _ in range(n)]

# Please write your code here.
result = 0
coins.reverse()

for i in coins:
    result += k // i # 해당 동전 (i) 몇 개 쓸 수 있는지
    k = k % i# 남은 금액 갱신(기존 k 에서 i로 나눈 나머지)

print(result)



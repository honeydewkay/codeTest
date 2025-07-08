n = int(input())
a = list(map(int, input().split()))

# Please write your code here.
a.sort(reverse=True)

for i in range(0,2):
    print(a[i], end=" ")
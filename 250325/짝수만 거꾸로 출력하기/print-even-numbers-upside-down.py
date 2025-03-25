N = int(input())
lst = list(map(int, input().split()))
lst2 = []
for i in lst[::-1]:
    if i % 2 == 0:
        print(i, end=" ")


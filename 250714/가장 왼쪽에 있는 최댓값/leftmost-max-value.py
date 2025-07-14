n = int(input())
a = list(map(int, input().split()))

# Please write your code here.
result = n 
while result != 0:
    result = a.index(max(a[0:result]))
    print(result + 1, end = " ")
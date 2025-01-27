inp = input()
arr = inp.split()
c = str(arr[0])
n = int(arr[1])
i = 1
if c == 'A':
    for i in range(1,n+1):
        print(i, end=" ")
if c == 'D':
    for i in range(1,n+1,-1):
        print(i, end=" ")

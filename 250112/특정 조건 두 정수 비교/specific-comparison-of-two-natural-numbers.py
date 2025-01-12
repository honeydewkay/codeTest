a = input()
arr = a.split()
x = int(arr[0])
y = int(arr[1])
if x < y:
    print(1, end=" ")
else:
    print(0, end=" ")

if x == y:
    print(1, end=" ")
else:
    print(0, end=" ")
    
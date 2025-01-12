a = input()
arr = a.split()
a1 = int(arr[0])
a2 = int(arr[1])
a3 = int(arr[2])


if a1 > a2 :
    if a2 > a3:
        print(a2) # a1>a2>a3
    elif a3>a1: # a3>a1>a2>
        print(a1)
else:
    print(a3)


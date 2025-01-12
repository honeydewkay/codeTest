a = input()
a1 = a.split()
a2 = int(a1[0]) #수학
a3 = int(a1[1]) #영어

b = input()
b1 = b.split()
b2 = int(b1[0]) #수학
b3 = int(b1[1]) #영어

if a2 > b2:
    print("A")
elif a2 < b2:
    print("B")
elif a2==b2:
    if a3 > b3:
        print("A")
    else:
        print("B")
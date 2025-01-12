a = input()
a1 = a.split()
a2 = int(a1[0]) 
a3 = int(a1[1]) 
a4 = int(a1[2]) 

if a2 > a3: 
    if a2 > a4:
        print(a2)
    if a2 < a4:
        print(a4)
else:
    print(a3)
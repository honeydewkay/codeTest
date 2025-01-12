a = input()
a1 = a.split()
a2 = int(a1[0]) 
a3 = int(a1[1]) 
a4 = int(a1[2]) 

if a2 > a3 and a2 > a4: 
    print(a2)
elif a3 > a4 and a3 > a2:
    print(a3)
elif a4 > a3 and a4 > a2:
    print(a4)

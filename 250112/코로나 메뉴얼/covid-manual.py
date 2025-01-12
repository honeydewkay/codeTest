# 변수 선언, 입력
inp1 = input()
arr1 = inp1.split()
a1 = str(arr1[0]) #flu
b1 = int(arr1[1]) #temp37

inp2 = input()
arr2 = inp2.split()
a2 = str(arr2[0])
b2 = int(arr2[1])

inp3 = input()
arr3 = inp3.split()
a3 = str(arr3[0])
b3 = int(arr3[1])

emer = 0

# inp1
if a1 == 'Y' and b1 >= 37:
    emer += 1
if a2 == 'Y' and b2 >= 37:
    emer += 1
if a3 == 'Y' and b3 >= 37:
    emer += 1

if emer >= 2:
    print("E")
else:
    print("N")
# inp2
# inp3
# emer >= 2 이면 E출력

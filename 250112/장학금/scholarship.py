a = input()
arr = a.split()
c = int(arr[0]) # 중간
d = int(arr[1]) # 기말
if c >= 90:
    if d >= 95:
        print(100000)
    elif d >= 90:
        print(50000)
    else:
        print(0)
else:
    print(0)
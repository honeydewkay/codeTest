n, q = tuple(map(int, input().split()))
data = list(map(int, input().split()))

for _ in range(q):

    query = list(map(int, input().split()))

    if query[0] == 1:
        
        a = query[1]
        print(data[a-1])
    
    elif query[0] == 2:
        b = query[1]
        if b in data:
            idx = data.index(b)  
            print(idx+1)
        else:
            print(0)
    else:
        s = query[1]
        e = query[2]
        for i in range(s-1, e):
            print(data[i], end=" ")
        print()
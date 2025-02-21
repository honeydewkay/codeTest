n = int(input())
cnt_odd = 1
cnt_even = cnt_odd

for i in range(n):
    if i % 2 == 0:
        for j in range(n):
            print(cnt_odd, end=" ")
            cnt_odd += 1

    else:
        cnt_even = cnt_odd
        for j in range(n):           
            print(cnt_even+n-1, end=" ")
            cnt_even -= 1
        cnt_odd += n
        
    print()

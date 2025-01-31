sum = 0
cnt = 0
while True:
    n = int(input())
    if n < 20 or n >= 30 :
        break
    if n >= 20 or n <= 29: # 20대
        sum += n
        cnt += 1
        
    
print("%.2f" % (sum/cnt))
    
         
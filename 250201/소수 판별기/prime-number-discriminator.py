sati = True
n = int(input())

for i in range(2, n):
    if n % i == 0:
        sati = False # 소수가 아님
if sati == False: # 소수가 아님
    print("C")
else:
    print("P")
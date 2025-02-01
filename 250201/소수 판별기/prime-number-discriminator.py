sati = False
n = int(input())

for i in range(2, n+1):
    if n % i == 0:
        sati = True
if sati == True:
    print("P")
else:
    print("C")
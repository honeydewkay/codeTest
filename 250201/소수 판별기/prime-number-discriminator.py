sati = False
n = int(input())

for i in range(2, n):
    if n % i == 0:
        sati = False
if sati == True:
    print("P")
else:
    print("C")
sati = False
n = int(input())
for i in range(2, n):
    if n % i == 0:
        sati = True
if sati == True:
    print("C")
else:
    print("N")
    
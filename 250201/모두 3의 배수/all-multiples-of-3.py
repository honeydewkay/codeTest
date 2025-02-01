sati = True
for i in range(5):
    n = int(input())
    if n % 3 != 0:
        sati = False
if sati == False:
    print(0)
else:
    print(1)
a, b, c = map(int, input().split())
sati = False
for i in range(a, b+1):
    if i % c == 0:
        sati = True
if sati == False:
    print("YES")
else:
    print("NO")
